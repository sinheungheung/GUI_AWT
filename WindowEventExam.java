package awtgui02;

import java.awt.*;
import java.awt.event.*;

public class WindowEventExam extends Frame implements WindowListener {
   public WindowEventExam(){
      super("종료 버튼을 눌러주세요.");
      setSize(300,100);
      setVisible(true);
       // 현재 프레임(this)에 이벤트 핸들러(addWindowListener)를 연결한다.
      addWindowListener(this); // 이벤트 연결
   }
   // 종료 버튼이 눌려졌을 때의 이벤트의 기능을 구현한다.
   public void windowClosing(WindowEvent e){
      System.exit(0);// 이제 x 누르면 작동한다.
   }
   // 구현 안하면 오류
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