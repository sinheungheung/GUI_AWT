package awtgui02;

import java.awt.*;
import java.awt.event.*;

public class WindowEventExam extends Frame implements WindowListener {
   public WindowEventExam(){
      super("���� ��ư�� �����ּ���.");
      setSize(300,100);
      setVisible(true);
       // ���� ������(this)�� �̺�Ʈ �ڵ鷯(addWindowListener)�� �����Ѵ�.
      addWindowListener(this); // �̺�Ʈ ����
   }
   // ���� ��ư�� �������� ���� �̺�Ʈ�� ����� �����Ѵ�.
   public void windowClosing(WindowEvent e){
      System.exit(0);// ���� x ������ �۵��Ѵ�.
   }
   // ���� ���ϸ� ����
   public void windowClosed(WindowEvent e){}
   public void windowActivated(WindowEvent e){}
   public void windowDeactivated(WindowEvent e){}
   public void windowIconified(WindowEvent e){}
   public void windowDeiconified(WindowEvent e){}
   public void windowOpened(WindowEvent e){}
   public static void main(String[] args){
      new WindowEventExam();
   }
}