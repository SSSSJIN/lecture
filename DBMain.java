package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 	JDBC 실행순서
 	1. 드라이버 로딩
 	2. DriverManger를 활용하여 DB접속
 	3. Query 생성해서 실행
 	4. 결과 받기
 	5. 종료
 */

public class DBMain {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn 
				= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
												"hr", "hr");
			
			System.out.println("conn : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









