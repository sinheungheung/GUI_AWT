package awtgui01;

import java.awt.*;


public class DialogExam extends Frame{
	public DialogExam() {
		super("Dialog"); // Frame ����
		Dialog d = new Dialog(this, "���̾�α�"); 
		// Dialog ���� : "���̾�α�"
		
		setSize(300, 100);
		setVisible(true);
		d.setSize(200, 50); // Dialog ũ��
		setVisible(true); // Dialog ���
	}
	public static void main(String[] args) {
		new DialogExam(); // �͸��� ��ü ����
	}
}