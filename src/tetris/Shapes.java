package tetris;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class Shapes {

	public static Random random = new Random();
	public static ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
	
	public Shapes() {
		shapes.add(new Rectangle(0,0,300,20));
		shapes.add(new Rectangle(0,0,20,100));
		shapes.add(new Rectangle(0,0,50,50));
		shapes.add(new Rectangle(0,0,50,50));
	}
}
