package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// t_test 테이블의 id, name 조회
public class SelectMain01 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			String sql	= "select id || '('  || name || ')' title ";
				   sql += " from t_test ";
				   sql += " order by id ";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				//String name = rs.getString("이름");
				
//				System.out.println(id + "(" + name + ")");
				System.out.println(id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}




