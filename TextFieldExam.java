package awtgui01;

import java.awt.*;

public class TextFieldExam extends Frame{
	public TextFieldExam () {
		super("�ؽ�Ʈ�ʵ�");
		Panel p = new Panel();
		TextField tf1 = new TextField("�ֹε�Ͼ��ڸ�");
		TextField tf2 = new TextField(15); // 15�� ���ڸ� �Է�
		tf1.selectAll(); // ���ڿ� ��ü�� ����
		tf2.setEchoChar('*'); // �Էµ� ���ڸ� '*'�� ǥ��

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