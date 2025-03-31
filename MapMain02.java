package kr.ac.kopo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Member {
	private String name;
	private String phone;
	
	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	
}



class Car extends Object{
	private String model;
	private String id;
	
	public Car() {
	}

	public Car(String model, String id) {
		super();
		this.model = model;
		this.id = id;
	}
	
}

public class MapMain02 {

	public static void main(String[] args) {
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		Member m3 = new Member("홍길동", "010-1111-2223");
		
		System.out.println("m.hashcode : " + m.hashCode());
		System.out.println("m2.hashcode : " + m2.hashCode());
		System.out.println("m3.hashcode : " + m3.hashCode());
		
		
		
		String s = new String("hello");
		String s2 = new String("hello");
		
		System.out.println("s.hashcode : " + s.hashCode());
		System.out.println("s2.hashcode : " + s2.hashCode());
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		*/
		
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("홍길동", "010-1111-2222"), new Car("모닝", "26나2367"));
		map.put(new Member("강길동", "010-3333-4444"), new Car("그랜저", "235도6734"));
		map.put(new Member("홍길동", "010-5555-6666"), new Car("산타페", "53마4567"));
		map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "351로4572"));
		
		System.out.println("등록대수 : " + map.size());
		
	}
}







