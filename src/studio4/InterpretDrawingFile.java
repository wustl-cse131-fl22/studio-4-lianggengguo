package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		Color custom = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(custom);
		
		//rectangle
		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		//ellipse
		if (shapeType.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		//triangle
		if (shapeType.equals("triangle") ) {
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			
			if (isFilled == true) {
				StdDraw.line(parameterOne, parameterTwo, parameterThree, parameterFour); 
			    StdDraw.line(parameterThree, parameterFour, parameterFive, parameterSix); //forming a triangle
			    StdDraw.line(parameterFive, parameterSix, parameterOne, parameterTwo); 
			    
				double[] xc = {parameterOne, parameterThree, parameterFive};
			    double[] yc = {parameterTwo, parameterFour, parameterSix};
			    StdDraw.filledPolygon(xc,yc);
			}
			else {
				StdDraw.line(parameterOne, parameterTwo, parameterThree, parameterFour); 
			    StdDraw.line(parameterThree, parameterFour, parameterFive, parameterSix); //forming a triangle
			    StdDraw.line(parameterFive, parameterSix, parameterOne, parameterTwo); 
			}
		}
	}
}
