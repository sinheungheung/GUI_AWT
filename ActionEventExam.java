package awtgui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener {

	Button b1 = new Button("버튼");
	Panel p = new Panel();
	public ActionEventExam() {
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,250);
		setVisible(true);
		// 이벤트 발생 객체(b1)에 이벤트 핸들러(addActionListener)을 연결한다
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			System.exit(0); // 프로그램 종료되면서 실행 창이 닫힘
			}
		}
		public static void main(String[] args){
			new ActionEventExam();
			}
		}