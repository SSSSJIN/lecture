package kr.ac.kopo.ui;

public class AddUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String title = scanStr("제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		String content = scanStr("내용을 입력하세요 : ");
		
		Thread.sleep(1000);
		
		System.out.println("\n게시글 등록이 완료되었습니다");
		
	}

	
}
