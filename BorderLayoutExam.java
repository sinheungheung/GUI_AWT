package awtgui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;


	public class BorderLayoutExam extends Frame{
		public BorderLayoutExam() {
			
			super("FlowLayout");
			setLayout(new BorderLayout());

			Button b1 = new Button("��");
			Button b2 = new Button("�Ʒ�");
			Button b3 = new Button("����");
			Button b4 = new Button("���");
			Button b5 = new Button("������");
			
			add(b1, BorderLayout.NORTH);
			add(b2, BorderLayout.SOUTH);
			add(b1, BorderLayout.	WEST);
			add(b2, BorderLayout.CENTER);
			add(b1, BorderLayout.EAST);
			
			setSize(150,150);
			setVisible(true);
		}
		public static void main(String[] args) {
			new BorderLayoutExam(); 
		}
	}