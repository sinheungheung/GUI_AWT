package awtgui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;


	public class BorderLayoutExam extends Frame{
		public BorderLayoutExam() {
			
			super("FlowLayout");
			setLayout(new BorderLayout());

			Button b1 = new Button("위");
			Button b2 = new Button("아래");
			Button b3 = new Button("왼쪽");
			Button b4 = new Button("가운데");
			Button b5 = new Button("오른쪽");
			
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