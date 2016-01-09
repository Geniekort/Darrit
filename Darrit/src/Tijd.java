import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Tijd {
	int tijd = 0;
	Font font = new Font("Arial", 20, 200);
	
	public void plus(int toe){
		tijd += toe;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(Integer.toString(tijd), 20,300);
	}
	
	public int getTijd() {
		return tijd;

	}
}
