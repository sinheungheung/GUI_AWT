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
      // Ű���� �Է��� �� ��ü(jumin1)�� �̺�Ʈ �ڵ鷯(addKeyListener)�� �����Ѵ�.
      jumin1.addKeyListener(this);
   }
   // Ű�� ���ȴٰ� �������� ���� �̺�Ʈ�� ����� �����Ѵ�.
   public void keyReleased(KeyEvent ke){
      if(jumin1.getText().trim().length() == 6){//�ؽ�Ʈ ���̰� 6�̸�
         jumin2.requestFocus();       //���� ĭ���� Ŀ���� �ű��.
      }
   }
   // Ű�� ������ ���� �̺�Ʈ�� ����� �����Ѵ�.
   public void keyPressed(KeyEvent ke)
   {
      if(ke.getKeyCode()==ke.VK_LEFT){
         jumin2.setText("Left ����");// 1���� ����Ű ������ �����ʿ� ���.
      }
   }
   // �߻� �޼ҵ��̹Ƿ� ������� �ʾƵ� �����ؾ� �Ѵ�.
   public void keyTyped(KeyEvent ke){}
   public static void main(String[] args){
      new KeyEventExam();
   }
}