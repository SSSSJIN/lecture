package kr.ac.kopo.day17.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	MAP : key, value 집합, key 에 대한 중복 X
		- HashMap
		- TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, String> members = new HashMap<>();
		members.put("aaa", "1111");
		members.put("bbb", "2222");
		members.put("ccc", "3333");
		members.put("ddd", "4444");
		
		System.out.println("**** 비밀번호 변경 서비스 ****");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!members.containsKey(id)) {
			System.out.println("입력하신 ID [" +id + "]는 존재하지 않습니다.");
			System.out.println("비밀번호 변경서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("현재 비밀번호를 입력하세요 : "); //단위 테스트 를 하는 방식을 적용해서 처음부터 코드치면 좋다
		String password = sc.nextLine(); // J Unit 을 활용한 단위테스트 를 나중에 배울 것이다
		
		if(!members.get(id).equals(password)) {
			System.out.println("비밀번호가 틀렸습니다.");
			System.out.println("비밀번호 변경서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("변경할 비밀번호를 입력하세요 : ");
		String newPassword = sc.nextLine();
		members.put(id, newPassword);
		
		System.out.println("비밀번호가 변경되었습니다.");
		System.out.println();
		
		System.out.println("<< 전체 회원목록 조회 >>");
		System.out.println("-----------------------");
		System.out.println("ID\tPASSWORD");
		System.out.println("-----------------------");
		
		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println(key +"\t" + members.get(key));
		}
		
		/*
		Set<Entry<String, String>> entry = members.entrySet();
		
		for(Entry<String, String> e : entry) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}		
		*/
		
		System.out.println("-----------------------");		
	}
}
