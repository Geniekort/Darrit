import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controller extends JPanel{

	private static final long serialVersionUID = 1L;

	JFrame frame;
	
	public Controller(String name){
		
		frame = new JFrame(name);
		
	}
	
	
	public static void main(String[] args) {
		new Controller("Live it");
	}
	
	
	
	
	
	
}
