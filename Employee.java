package kr.ac.kopo.day11;

public class Employee {

	int 	no;
	String 	name;
	String 	grade;
	int 	salary;
	
	Employee() {}
	
	Employee(int no, String name, String grade, int salary) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	
	void info() {
		System.out.println("----------------------------------------");
		System.out.println(" 사원번호 : " + no);
		System.out.println(" 사 원 명 : " + name);
		System.out.println(" 직   급 : " + grade);
		System.out.println(" 연   봉 : " + salary);
		System.out.println("----------------------------------------");
	}
}
