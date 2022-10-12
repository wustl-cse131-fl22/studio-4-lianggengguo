package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		//background
		Color pastelblue = new Color(182,216,242);
		StdDraw.setPenColor(pastelblue);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.24);
		
		Color pastelyellow = new Color(247, 246, 207);
		StdDraw.setPenColor(pastelyellow);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.08);
		
		//circles
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.004);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.24);
		
		Color brown = new Color(196, 164, 132);
		StdDraw.setPenColor(brown);
		StdDraw.filledCircle(0.25, 0.6, 0.1);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.6, 0.4, 0.05);
		
		Color pastelpurple = new Color(228, 185, 198);
		StdDraw.setPenColor(pastelpurple);
		StdDraw.filledCircle(0.65, 0.44, 0.04);
	}
}