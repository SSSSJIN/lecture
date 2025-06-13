package kr.ac.kopo.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardVO> selectBoardAll() {
		return sqlSessionTemplate.selectList("board.dao.BoardDAO.selectAllBoard");
	}

	@Override
	public void insertBoard(BoardVO newBoard) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardVO selectBoardByNo(int boardNo) {
		
		return sqlSessionTemplate.selectOne("");
	}

	@Override
	public void updateBoard(BoardVO board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoardByNo(int boardNo) {
		// TODO Auto-generated method stub

	}

}
