package awtgui01;

import java.awt.*;

public class FlowLayoutExam extends Frame{
	public FlowLayoutExam() {
		
		super("FlowLayout");
		setLayout(new FlowLayout());

		Button b1 = new Button("ù��°");
		Button b2 = new Button("�ι�°");
		Button b3 = new Button("����°");

		add(b1);
		add(b2);
		add(b3);

		setSize(500, 150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new FlowLayoutExam(); 
	}
}