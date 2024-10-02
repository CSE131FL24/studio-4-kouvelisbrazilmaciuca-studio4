package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {

    public static void main(String[] args) throws FileNotFoundException {
        // Open file chooser
        JFileChooser chooser = new JFileChooser("resources");
        chooser.showOpenDialog(null);
        File f = new File(chooser.getSelectedFile().getPath());
        
        // Create a Scanner to read the file
        Scanner in = new Scanner(f);

        // Read shape information (e.g., shape type, color, dimensions)
        String shapeType = in.next(); // e.g., "rectangle", "ellipse"
        int red = in.nextInt(); // Color values
        int green = in.nextInt();
        int blue = in.nextInt();
        boolean filled = in.nextBoolean(); // Whether the shape is filled
        double x = in.nextDouble(); // Shape coordinates or size
        double y = in.nextDouble();
        double halfWidth = in.nextDouble();
        double halfHeight = in.nextDouble();
        
        // Set the color based on RGB values
        StdDraw.setPenColor(red, green, blue);

        // Draw the shape based on its type
        if (shapeType.equals("rectangle")) {
            if (filled) {
                StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
            } else {
                StdDraw.rectangle(x, y, halfWidth, halfHeight);
            }
        } else if (shapeType.equals("ellipse")) {
            if (filled) {
                StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
            } else {
                StdDraw.ellipse(x, y, halfWidth, halfHeight);
            }
        }
        // Additional shape types can be added here

        // Close the scanner
        in.close();
    }
}