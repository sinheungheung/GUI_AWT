package awtgui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener {

	Button b1 = new Button("��ư");
	Panel p = new Panel();
	public ActionEventExam() {
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,250);
		setVisible(true);
		// �̺�Ʈ �߻� ��ü(b1)�� �̺�Ʈ �ڵ鷯(addActionListener)�� �����Ѵ�
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			System.exit(0); // ���α׷� ����Ǹ鼭 ���� â�� ����
			}
		}
		public static void main(String[] args){
			new ActionEventExam();
			}
		}