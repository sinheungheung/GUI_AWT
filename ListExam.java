package awtgui01;

import java.awt.*;

public class ListExam extends Frame{
	public ListExam () {
		super("����Ʈ");
		Panel p = new Panel();
		List list1 = new List(4, true); // 4���� �׸��� �����ش�, ���߼��ð���

		// ��� ������ �Է�
		list1.add("��");
		list1.add("ȭ");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");

		p.add(list1);
		add(p);
		setSize(300, 150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new ListExam(); 
	}
}