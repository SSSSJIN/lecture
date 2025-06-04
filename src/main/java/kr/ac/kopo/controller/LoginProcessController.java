package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.framework.Controller;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

public class LoginProcessController implements Controller {
	
	private MemberService memberService;

	public LoginProcessController() {
		memberService = new MemberService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// 파라미터 추출(id, password)
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// DB(t_member)에서 로그인여부 판단
		MemberVO member = new MemberVO(id, password);
		MemberVO userVO = memberService.login(member);
		
		// 판단여부에 따른 결과 응답(response)
		String msg = "";
		String url = "";
		if(userVO == null) {
			// 로그인 실패
			msg = "아이디 또는 패스워드가 잘못되었습니다. 다시 입력해주세요";
			url = "/Board-WEB/login.do";
		} else {
			// 로그인 성공
			msg = userVO.getName() + "님 환영합니다";
			url = "/Board-WEB";
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);

		return "/login/loginProcess.jsp";
	}

}







