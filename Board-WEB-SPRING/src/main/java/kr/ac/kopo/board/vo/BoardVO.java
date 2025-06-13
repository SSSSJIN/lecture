package kr.ac.kopo.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardVO {

	private int no;
	private String title;
	private String writer;
	private String content;
	private int viewCnt;
	private String regDate;
}
