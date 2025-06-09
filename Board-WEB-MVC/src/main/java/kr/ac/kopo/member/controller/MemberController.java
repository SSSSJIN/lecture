package kr.ac.kopo.member.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.framework.ModelAndView;
import kr.ac.kopo.framework.annotation.RequestMapping;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

public class MemberController {

	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("/login/login.jsp");
		return mav;
	}
	
	@RequestMapping("/loginProcess.do")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("redirect:");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberVO loginVO = new MemberVO(id, password);
		
		ServletContext sc = request.getServletContext();
		MemberService memberService = (MemberService)request.getAttribute("memberService");
		
		MemberVO userVO = memberService.login(loginVO);
		
		if(userVO == null) {
			mav.setView("redirect:/login.do");
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
		} else {
			mav.setView("redirect:");			
		}
		
		return mav;
	}
}
