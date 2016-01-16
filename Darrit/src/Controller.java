import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Controller extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JFrame frame;
	Timer timer;
	Tijd klokkie;
	
	public Controller(String name){
		
		
		frame = new JFrame(name);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		frame.add(this);
		
		timer = new Timer(1, this);
		timer.start();
		
		
		klokkie = new Tijd(150, 150 , 100);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Controller("Live it");
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		klokkie.draw(g);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		klokkie.update();
		if(klokkie.getTijd() == 1000){
			timer.stop();
			this.setBackground(Color.red);
		}
		this.repaint();
		
		
		
	
	}
	
	
	
	
	
	
}
