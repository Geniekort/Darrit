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
		sec = tijd;
		
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
		g.drawOval(x-radius, y-radius,2*radius,2*radius);
		g.drawLine(x, y, x + (int)((Math.sin((double)sec/6000*2*Math.PI)*radius)), y - (int)(Math.cos((double)sec/6000*2*Math.PI)*radius));
	}
	
	public int getTijd() {
		return tijd;

	}
}
