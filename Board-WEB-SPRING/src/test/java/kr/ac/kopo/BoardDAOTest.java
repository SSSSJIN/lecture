package kr.ac.kopo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml"})
public class BoardDAOTest {

	@Autowired
	BoardDAO boardDao;
	
	@Test
	public void 전제게시글조회테스트() throws Exception{
		List<BoardVO> list = boardDao.selectBoardAll();
		assertEquals(list.size(), 0);
	}
	
}
