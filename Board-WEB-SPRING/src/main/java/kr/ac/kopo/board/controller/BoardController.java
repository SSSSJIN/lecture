package kr.ac.kopo.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public ModelAndView boardList() {
		
		List<BoardVO> boardList = boardService.listAllService();

		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("boardList", boardList);
		
		return mav;
	}
	
	@GetMapping("/board/detail")
	public void boardDetail(@RequestParam("no") int boardNo, HttpServletRequest request) {
		
		BoardVO board = boardService.getBoardService(boardNo);
		request.setAttribute("board", board);		
	}
	
	@GetMapping("/board/{no}")
	public String getBoard(@PathVariable("no") int boardNo, Model model) {
		BoardVO board = boardService.getBoardService(boardNo);
		model.addAttribute("board", board);
		
		return "board/detail";
	}
}

