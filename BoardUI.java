package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.exception.ChoiceOutOfBoundException;

public class BoardUI extends BaseUI {
	
	private String menu() {
		System.out.println("-----------------------------------");
		System.out.println("\t<< 게시판 관리 프로그램 >>");
		System.out.println("-----------------------------------");
		System.out.println("\t1. 전체게시글 조회");
		System.out.println("\t2. 글번호 조회");
		System.out.println("\t3. 게시글 등록");
		System.out.println("\t4. 게시글 수정");
		System.out.println("\t5. 게시글 삭제");
		System.out.println("\t0. 종료");
		System.out.println("-----------------------------------");
		String type = scanStr("\t항목을 선택하세요 : ");
		
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		
		while (true) {
			try {
				String choice = menu();
				IBoardUI ui = null;
				switch (choice) {
				case "1":
					ui = new SearchAllUI();
					break;
				case "2":
					ui = new SearchOneUI();
					break;
				case "3":
					ui = new AddUI();
					break;
				case "4":
					ui = new UpdateUI();
					break;
				case "5":
					ui = new DeleteUI();
					break;
				case "0":
					ui = new ExitUI();
					break;
				}
				if (ui != null)
					ui.execute();
				else {
					System.out.println("\n\t메뉴번호를 잘못 선택하셨습니다.");
					//throw new ChoiceOutOfBoundException("\n\t메뉴번호가 잘못선택되었습니다");
				}
			} catch (ChoiceOutOfBoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}






