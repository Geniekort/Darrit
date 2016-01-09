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
	Tijd klokkie;
	
	public Controller(String name){
		
		
		frame = new JFrame(name);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		timer = new Timer(100, this);
		timer.start();
		
		klokkie = new Tijd();
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Controller("Live it");
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		klokkie.draw(g);
		System.out.println("Do");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		klokkie.plus(10);
		System.out.println("here");
		this.repaint();
	}
	
	
	
	
	
	
}
