package kr.ac.kopo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.ac.kopo.board.vo.BoardVO;

public class MyBatisMain {

    public static void main(String[] args) {
        
    	
    	/*
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	        
	        SqlSession session = sqlSessionFactory.openSession();
	        
	        BoardVO board = new BoardVO("myBatis 삽입을 해보자", "user", "어서어서해보자!!!");
	        
	        session.insert("board.dao.BoardDAO.insert", board);
	        session.commit();
	        
	        System.out.println("삽입완료...");
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
        */
    }
}
