package kr.ac.kopo.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

	@GetMapping("/list.do")
	public void list() {
		
	}
	
	@GetMapping("/detail.do")
	public void detail() {
		
	}
}
