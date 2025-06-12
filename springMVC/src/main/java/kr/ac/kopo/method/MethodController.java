package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/method/method.do")
@Controller
public class MethodController {

	public MethodController() {
		System.out.println("MethodController 객체 생성....");
	}

//	@RequestMapping(value="/method/method.do", method=RequestMethod.GET)
//	@GetMapping("/method/method.do")
	@GetMapping
	public String callGet() {
		return "method/methodForm";
	}
	
//	@RequestMapping(value="/method/method.do", method=RequestMethod.POST)
//	@PostMapping("/method/method.do")
	@PostMapping
	public String callPost() {
		return "method/methodProcess";
	}
	
}









