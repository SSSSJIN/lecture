package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.dao.BoardDAOImpl;
import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.framework.Controller;

public class BoardWriteController implements Controller {

	private BoardDAO boardDao;
	
	public BoardWriteController() {
		boardDao = new BoardDAOImpl();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		BoardVO board = new BoardVO(title, writer, content);
		boardDao.insertBoard(board);

		return "redirect:/board/list.do";
	}

	
}
