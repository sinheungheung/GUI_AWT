package awtgui01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutExam extends Frame{
	public GridLayoutExam() {
		
		super("GridLayoutExam");
		setLayout(new GridLayout(2,3)); // 2�� 3�� ���·� ǥ��

		Button b1 = new Button("��ư 1");
		Button b2 = new Button("��ư 2");
		Button b3 = new Button("��ư 3");
		Button b4 = new Button("��ư 4");
		Button b5 = new Button("��ư 5");
		Button b6 = new Button("��ư 6");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);

		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutExam(); 
	}
}