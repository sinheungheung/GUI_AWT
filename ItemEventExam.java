package awtgui02;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventExam extends Frame implements ItemListener{
		Panel p1  = new Panel();
		TextArea ta = new TextArea(7,15);
		Checkbox cb1 = new Checkbox("키위", false);
		Checkbox cb2 = new Checkbox("사과", false);
		Checkbox cb3 = new Checkbox("딸기", false);

		public ItemEventExam(){
		super("ItemEvent");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		
		add(p1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		// 이벤트 발생 객체(b1)에 이벤트 핸들러(addActionListener)을 연결한다
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
			}
		public static void main(String[]args){
			new ItemEventExam();
			}
		public void itemStateChanged(ItemEvent ie){
			if(ie.getStateChange() == ItemEvent.SELECTED)
					ta.append(ie.getItem() + " 가 선택됨 \n\n");
				else if(ie.getStateChange() == ItemEvent.DESELECTED)
					ta.append(ie.getItem() +  " 가 취소됨 \n\n");
			}
		}


