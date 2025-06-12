package kr.ac.kopo.resbody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.vo.MemberVO;

@RestController
@RequestMapping("/ajax")
public class ResBodyController {

//	@ResponseBody
	@GetMapping("/resBody.do")
	public String resStringBody() {
		return "OK, 성공";
	}
	
//	@ResponseBody
	@GetMapping("/estBody.json")
	public Map<String, String> resJsonBody(){
		Map<String, String> result = new HashMap<>();
		result.put("ID", "hong");
		result.put("NAME", "홍길동");
		result.put("ADDR", "경기도 성남시 수정구");
		
		return result;
	}
	
	@GetMapping("/resBodyVOList.json")
	public List<MemberVO> resJsonVO() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO member = new MemberVO("hong", "1234hong", "홍길동");
		list.add(member);
		list.add(new MemberVO("kim", "kim6789", "김길순"));
		list.add(new MemberVO("park", "park6789", "박동상"));
		return member;
	}
	
}
