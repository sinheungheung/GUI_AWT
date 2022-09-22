package awtgui02;

import java.awt.*;
import java.awt.event.*;

public class KeyEventExam extends Frame implements KeyListener {
   TextField jumin1 = new TextField(10);
   Label lb = new Label("-",Label.CENTER);
   TextField jumin2 = new TextField(10);
   Panel p = new Panel();

   public KeyEventExam(){
      super("KeyEvent");
      p.add(jumin1);
      p.add(lb);
      p.add(jumin2);
      add(p);
      setSize(300,100);
      setVisible(true);
      // 키보드 입력이 될 객체(jumin1)에 이벤트 핸들러(addKeyListener)를 연결한다.
      jumin1.addKeyListener(this);
   }
   // 키가 눌렸다가 떼어졌을 때의 이벤트의 기능을 구현한다.
   public void keyReleased(KeyEvent ke){
      if(jumin1.getText().trim().length() == 6){//텍스트 길이가 6이면
         jumin2.requestFocus();       //다음 칸으로 커서를 옮긴다.
      }
   }
   // 키가 눌렸을 때의 이벤트의 기능을 구현한다.
   public void keyPressed(KeyEvent ke)
   {
      if(ke.getKeyCode()==ke.VK_LEFT){
         jumin2.setText("Left 눌림");// 1에서 왼쪽키 누르면 오른쪽에 뜬다.
      }
   }
   // 추상 메소드이므로 사용하지 않아도 정의해야 한다.
   public void keyTyped(KeyEvent ke){}
   public static void main(String[] args){
      new KeyEventExam();
   }
}