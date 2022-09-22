package swing01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends Frame{
	public FlowLayoutEx(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c. add(new JButton("add"));
		c. add(new JButton("sub"));
		c. add(new JButton("mul"));
		c. add(new JButton("div"));
		c. add(new JButton("Calculate"));


		setSize(300, 200);
		setVisible(true);
			}
		private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
		private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
		public static void main(String[] args){
		new FlowLayoutEx();
			}
		}

