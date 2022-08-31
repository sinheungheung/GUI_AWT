package awtgui01;

import java.awt.Frame;

public class FrameExam2 extends Frame{
	public FrameExam2() {
		super("제목"); 
		// 부모클래스 Frame의 생성자 중에서 "제목" 문자열을 받는 생성자 실행
		// --> Frame("제목")을 실행하면서 Frame에 타이틀을 표시
		this.setLocation(500, 200);
		setSize(350, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameExam2 f = new FrameExam2();
	}
}
