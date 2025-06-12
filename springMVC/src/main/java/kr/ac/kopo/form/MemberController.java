package kr.ac.kopo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.vo.MemberVO;

@RequestMapping("/form")
@Controller
public class MemberController {

	@GetMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	@PostMapping("/join.do") 
	public String join(@ModelAttribute("member") MemberVO member) {
	
		
		System.out.println(member);
		
		return "form/memberInfo";
	}
}














