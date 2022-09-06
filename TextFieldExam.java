package awtgui01;

import java.awt.*;

public class TextFieldExam extends Frame{
	public TextFieldExam () {
		super("텍스트필드");
		Panel p = new Panel();
		TextField tf1 = new TextField("주민등록앞자리");
		TextField tf2 = new TextField(15); // 15개 문자를 입력
		tf1.selectAll(); // 문자열 전체를 선택
		tf2.setEchoChar('*'); // 입력된 문자를 '*'로 표시

		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400, 100);
		setVisible(true);

	}
	public static void main(String[] args) {
		new TextFieldExam(); 
	}
}