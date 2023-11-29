package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MyFirstSwing extends JFrame {
	 public MyFirstSwing(){
		initializecomp();
	}
	
	private void initializecomp() {
		JButton button=new JButton("click Me!");
		JButton label=new JButton("Hello,Swing");
		JButton check=new JButton("Chechk");
		setLayout(new FlowLayout());
		add(button);
		add(label);
		add(check);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			MyFirstSwing ss=new MyFirstSwing();
			ss.setTitle(" My Swing App");
			ss.setSize(300, 200);
			ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ss.setVisible(true);			
		});
		System.out.println("Rutuja");
		}
}
