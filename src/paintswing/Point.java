package paintswing;

import java.awt.Color;

public class Point {
	private int x;
	private int y;
	private int x2;
	private int y2;
	private Color color;
	public Point(int x, int y,int x2,int y2,Color color) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.x2=x2;
		this.y=y;
		this.y2=y2;
		this.color=color;
		
	}
	public Point(int x, int y,int x2,int y2) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.x2=x-x2;
		this.y=y;
		this.y2=y2-y;
		this.color=Color.BLACK;
		
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getX2(){
		return x2;
	}
	public int getY2(){
		return y2;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
		
	}

}
