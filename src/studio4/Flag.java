package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(1.0 / 6.0, 0.5, 1.0 / 6.0, 1.0);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(3.0 / 6.0, 0.5, 1.0 / 6.0, 1.0);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(5.0 / 6.0, 0.5, 1.0 / 6.0, 1.0);
	}
}