import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Controller extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JFrame frame;
	javax.swing.Timer timer;
	
	public Controller(String name){
		
		frame = new JFrame(name);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		timer = new Timer(100, this);
		
	}
	
	
	public static void main(String[] args) {
		new Controller("Live it");
	}
	
	public void paintComponent(Graphics g){
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
