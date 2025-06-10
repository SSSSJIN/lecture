package kr.ac.kopo.board.dao;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.ac.kopo.MyBatisConfig;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDAO {

	private SqlSession session;
	
	public BoardDAO() {
		this.session = new MyBatisConfig().getInstance();
	}
		
	public void insert(BoardVO board) {
		session.insert("board.dao.BoardDAO.insert", board);
		session.commit();
	}
		
	public List<BoardVO> searchAll() {
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectALL");
		return list;
	}

	public BoardVO selectByNo(int boardNo) {
		//return session.selectOne("board.dao.BoardDAO.selectByNo", boardNo);
		return session.selectOne("board.dao.BoardDAO.selectByNo2", boardNo);
		
	}
	
	public List<BoardVO> selectByWhere(BoardVO board) {
		return session.selectList("board.dao.BoardDAO.selectWhere", board);
	}
	
	public List<BoardVO> selectByWhere2(Map<String, String> keywords) {
		
		return session.selectList("board.dao.BoardDAO.selectWhere", keywords);	
	}
	
	public List<BoardVO> selectBoardByNos(int[] nos){
		return session.selectList("board.dao.BoardDAO.selectByNos", nos);
	}
}

