package swing01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPanelEx extends JFrame{
	public ContentPanelEx() {
		setTitle("ContentPanel�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame â�� x��ư�� ������ â�� ������, ���α׷� ������ ����
		
		Container contentPane = getContentPane();
		// contentPanel��ü ����
		contentPane.setBackground(Color.ORANGE);
		// contentPanel�� ����
		contentPane.setLayout(new FlowLayout());
		// contentPanel�� �� ������Ʈ���� ���� ��� ����

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		// contentPanel�� ��ư���� ����
	}
}
