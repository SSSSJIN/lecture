package kr.ac.kopo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

public class MenuUI {

	BoardDAO boardDao;
	
	public MenuUI() {
		boardDao = new BoardDAO();
	}
	
	private void addBoard() {
		BoardVO board = new BoardVO("새롭게 다시 시작", "닌자", "다시 넣겠다!!!!");
		boardDao.insert(board);
		System.out.println("새로운 게시글 등록완료...");
		
	}
	
	private void searchAllBoard() {
		List<BoardVO> list = boardDao.searchAll();
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
	private void searchBoard() {
		BoardVO board = boardDao.selectByNo(5);
		System.out.println(board);
	}
	
	private void searchBoardWhere() {
		/*
		// 방법1 제목이 "mybatis연습", 작성자가 "mybatis" 게시물 조회
		BoardVO board = new BoardVO();
		board.setTitle("mybatis연습");
		board.setWriter("mybatis");
		*/
		/*		
		// 방법2 제목이 "mybatis연습" 게시물 조회
		board.setTitle("mybais연습");
		*/
		/*
		// 방법3 작성자가 "닌자" 게시물 조회
		board.setWriter("닌자");
		*/
		
		// 방법4 
		
		List<BoardVO> list = boardDao.selectByWhere(board);
		for (BoardVO vo : list) {
		    System.out.println(vo);
		}
	}
	
	private void searchBoardWhere2() {
		Map<String, String> keywords = new HashMap<>();
		
		/*
		// 방법1 제목이 "mybatis연습", 작성자가 "mybatis" 게시물 조회
		keywords.put("title", "mybatis연습");
		keywords.put("writer", "닌자");
		
		BoardVO board = new BoardVO();
		board.setTitle("mybatis연습");
		board.setWriter("mybatis");
		*/
		/*		
		// 방법2 제목이 "mybatis연습" 게시물 조회
		board.setTitle("mybais연습");
		*/
		/*
		// 방법3 작성자가 "닌자" 게시물 조회
		board.setWriter("닌자");
		*/
		
		// 방법4 
		
		List<BoardVO> list = boardDao.selectByWhere2(keywords);
		for (BoardVO vo : list) {
		    System.out.println(vo);
		}
	}
	
	private void searchBoardNos() {
		int[] nos = {1, 5, 10, 15, 20, 25};
		List<BoardVO> list = boardDao.selectBoardByNos(nos);
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void execute() {
		//addBoard();
	    //searchAllBoard();
		//searchBoard();
		//searchBoardWhere();
		//searchBoardWhere2();
		searchBoardNos();
	}
}
