package awtgui01;

import java.awt.Frame;

public class FrameExam1 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("제목연습"); // 프레임 제목
		f.setLocation(500, 200); // 모니터 안 Frame의 x좌표 y좌표 위치
		f.setSize(350, 100); // 프레임의 크기
		f.setVisible(true); // 화면에 출력
		
	}

}
