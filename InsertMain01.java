package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// id : hong  name : 홍길동 데이터 삽입
public class InsertMain01 {

	public static void main(String[] args) {
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료...");
			
			// 2단계 : DB접속 Connection 객체 얻기
			String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			// 3단계 : 쿼리생성 및 실행
			String sql  = "insert into t_test(id, name) ";
				   sql += " values('hong', '홍길동') ";
			Statement stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}







