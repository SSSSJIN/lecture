package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {

//	@RequestMapping(value="/method/method.do", method=RequestMethod.GET)
	@GetMapping("/method/method.do")
	public void callGet() {
		System.out.println(" GET방식 /method/method.do 요청발생!!!");
	}
	
//	@RequestMapping(value="/method/method.do", method=RequestMethod.POST)
	@PostMapping("/method/method.do")
	public void callPost() {
		System.out.println(" POST방식 /method/method.do 요청발생!!!");
	}
	
	
	
}
