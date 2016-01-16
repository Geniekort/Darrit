import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Tijd {
	int tijd = 0;
	int x,y,radius;
	int sec = 0;
	Font font = new Font("Arial", 20, 200);
	
	public Tijd(int xin,int yin, int radiusin){
		x = xin;
		y = yin;
		radius = radiusin;
	}
	
	public void update(){
		plus(1);
		sec = tijd/1000;
		
	}
	
	public void setX(int setx) {
		x = setx;
	}
	
	public void setRadius(int setr){
		radius = setr;
	}
	
	public void setY(int sety){
		y = sety;
	}
	
	public void plus(int toe){
		tijd += toe;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(Integer.toString(tijd), 20,300);
		g.drawOval(x-radius, y-radius,2*radius,2*radius);
		g.drawLine(x, y, (Math.sin(sec/60*2*Math.PI)), Math.cos(sec/60*2*Math.PI));
	}
	
	public int getTijd() {
		return tijd;

	}
}
