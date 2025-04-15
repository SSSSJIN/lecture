package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

public class SelectMain02 {

	public static void main(String[] args) {
		
		try {
			Connection conn = new ConnectionFactory().getConnection();
			
			// 3단계
			StringBuilder sql = new StringBuilder();
			sql.append("select lower(id) id, name ");
			sql.append("  from t_test ");
			sql.append(" order by id ");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}





