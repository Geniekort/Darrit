import java.awt.Color;
import java.awt.Graphics;

public class Tijd {
	int tijd = 0;
	
	public void plus(int toe){
		tijd += toe;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("hi", 20,20);
		System.out.println("Zoals");
	}
}
