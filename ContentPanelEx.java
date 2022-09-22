package swing01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPanelEx extends JFrame{
	public ContentPanelEx() {
		setTitle("ContentPanel과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame 창의 x버튼을 누르면 창이 닫히고, 프로그램 실행이 종료
		
		Container contentPane = getContentPane();
		// contentPanel객체 생성
		contentPane.setBackground(Color.ORANGE);
		// contentPanel의 배경색
		contentPane.setLayout(new FlowLayout());
		// contentPanel에 들어갈 컴포넌트들의 정렬 방법 설정

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		// contentPanel에 버튼들을 부착
	}
}
