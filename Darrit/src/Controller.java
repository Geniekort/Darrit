import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Controller extends JPanel implements ActionListener, MouseListener{

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
		frame.addMouseListener(this);
		
		
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
		klokkie.plus(1);
		this.repaint();
		
		
		
	
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		
	}


	@Override
	public void mousePressed(MouseEvent e) {

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
