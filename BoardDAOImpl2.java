package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.mybatis.MyBatisConfig;

/**
 * MyBatis 기반 BoardDAO 구현체
 * - 기존 JDBC 코드와 달리, SqlSession을 통해 board-mapper.xml의 쿼리를 호출
 * - SqlSessionFactory는 MyBatisConfig에서 싱글턴으로 관리
 * - 메서드별로 mapper의 id와 파라미터, 결과타입에 주의!
 */
public class BoardDAOImpl2 implements BoardDAO {

    private final SqlSessionFactory factory;

    public BoardDAOImpl2() {
        System.out.println("myBatis 기반 BoardDAO 객체 생성....");
        this.factory = MyBatisConfig.getSqlSessionFactory();
    }

    /**
     * 게시글 전체 목록 조회
     * - 기존 JDBC: 직접 SQL 작성 및 ResultSet 반복
     * - MyBatis: selectList로 한 줄로 처리
     * - mapper의 namespace/id는 boardmapper.xml에 등록된 대로 맞춰야 함
     * - resultType 또는 resultMap이 boardVO로 맞는지 확인
     */
    @Override
    public List<BoardVO> selectBoardAll() {
        try (SqlSession session = factory.openSession()) {
            // boardmapper.xml의 <select id="selectBoardALL">와 일치해야 함
            return session.selectList("board.dao.BoardDAO.selectBoardALL");
            // ※ 네임스페이스와 id는 boardmapper.xml <mapper namespace="board.dao.BoardDAO"> 기준
        }
    }

    /**
     * 게시글 등록(삽입)
     * - 기존 JDBC: PreparedStatement로 insert 쿼리 작성
     * - MyBatis: insert 호출, 커밋 필요
     * - 파라미터 BoardVO의 필드명이 XML #{title}, #{writer}, #{content}와 일치해야 함
     */
    @Override
    public void insertBoard(BoardVO newBoard) {
        try (SqlSession session = factory.openSession()) {
            session.insert("board.dao.BoardDAO.insert", newBoard);
            session.commit();
        }
    }

    /**
     * 게시글 번호로 단일 게시글 조회
     * - 기존 JDBC: where no = ? 조건으로 select, ResultSet에서 BoardVO 생성
     * - MyBatis: selectOne 사용, 파라미터는 게시글 번호(int)
     * - resultType/resultMap이 boardVO로 매핑되는지 확인
     */
    @Override
    public BoardVO selectBoardByNo(int boardNo) {
        try (SqlSession session = factory.openSession()) {
            return session.selectOne("board.dao.BoardDAO.selectByNo", boardNo);
        }
    }

    /**
     * 게시글 수정
     * - boardmapper.xml에 <update id="updateBoard"> 쿼리 필요
     * - update 호출 후 반드시 commit
     */
    @Override
    public void updateBoard(BoardVO board) {
        try (SqlSession session = factory.openSession()) {
            session.update("board.dao.BoardDAO.updateBoard", board);
            session.commit();
        }
    }

    /**
     * 게시글 삭제
     * - boardmapper.xml에 <delete id="deleteBoardByNo"> 쿼리 필요
     * - delete 호출 후 반드시 commit
     */
    @Override
    public void deleteBoardByNo(int boardNo) {
        try (SqlSession session = factory.openSession()) {
            session.delete("board.dao.BoardDAO.deleteBoardByNo", boardNo);
            session.commit();
        }
    }
}
