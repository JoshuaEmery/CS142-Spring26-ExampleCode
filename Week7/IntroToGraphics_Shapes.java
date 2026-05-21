import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class IntroToGraphics_Shapes {

    public static Color randomColor() {
        int red   = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue  = (int)(Math.random() * 256);
        return new Color(red, green, blue);
    }

    public static void draw(Graphics g, int width, int height) {


        // RECTANGLES

        // g.drawRect(x, y, w, h)  draws just the OUTLINE of a rectangle
        // g.fillRect(x, y, w, h)  fills the rectangle solid with current color
    	//setColor
    	g.setColor(Color.BLACK);
    	g.drawRect(20, 20, 150, 80);
    	
    	//another recotangle next to it
    	g.setColor(Color.GREEN);
    	g.drawRect(190, 20, 150, 80);
    	g.setColor(Color.BLUE);
    	g.fillRect(190, 20, 150, 80);
    	
    	//rectangle with a different color border
    	g.setColor(Color.YELLOW);
    	g.fillRect(360, 20, 150, 80);
    	//Lay a blue oval overtop the yellow rectangle
    	g.setColor(Color.BLUE);
    	g.fillOval(360, 20, 150, 80);
    	g.setColor(Color.BLACK);
    	g.drawRect(360, 20, 150, 80);

        
        // OVALS AND CIRCLES
        //
        // g.drawOval(x, y, w, h) draws just the OUTLINE of an oval
        // g.fillOval(x, y, w, h)  → fills the oval solid with current color
        //
        // (x, y) is the TOP-LEFT corner of the BOUNDING BOX, NOT the center
    	
    	//g.drawOval(20, 120, 150, 80);
    	g.fillOval(20, 120, 150, 80);


        // CENTERING A SHAPE WITH width AND height
    	// we can get the center of the canvas with width/2 height/2
    	//then we need to factor in the dimension of our shape to center it
    	int centerX = width / 2;
    	int centerY = height / 2;
    	int widthOfShape = 150;
    	int heightOfShape = 80;
    	int shapeOriginX = centerX - widthOfShape / 2;
    	int shapeOriginY = centerY - heightOfShape / 2;
    	g.setColor(Color.MAGENTA);
    	g.fillOval(shapeOriginX, shapeOriginY, widthOfShape, heightOfShape);


        // DRAWING TEXT
    	g.drawString("Text to draw", 20, 400);
    	
    	
    	//Gradient with circles
    	//draw a row of circles with a for loop that change colors
    	int circleSize = 20;
    	for(int x = 0; x + circleSize <= width; x+=circleSize) {
    		double ratio = 256.0 / width;
    		double blueAmount = x * ratio;
    		double redAmount = x * ratio;
    		
    		g.setColor(new Color((int)redAmount, 150, (int)blueAmount));
    		g.fillOval(x, height - circleSize, circleSize, circleSize);
    	}


        // CHALLENGE IDEAS:
        //
        // 1. Traffic light: a tall dark fillRect, with 3 fillOval circles
        //    stacked vertically in red, yellow, and green.
        //
        // 2. Simple face: a large fillOval for the head, smaller fillOvals
        //    for eyes, a drawOval for the mouth (or a drawLine smile).
        //
        // 3. Bullseye target: draw 3 concentric filled circles in alternating
        //    red and white, each smaller than the last.
        //    Hint: draw the largest first, so smaller ones appear on top.
        //
        // 4. Checkerboard: nested loops with fillRect, alternating between
        //    two colors based on whether (row + col) is even or odd.
        //
        // 5. Make the gradient circle row at the bottom use randomColor()
        //    instead of the calculated color - compare the two effects.
    }

    // Leave main() alone! It sets up the drawing window for you.
    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics window - Shapes");
        window.setLocationByPlatform(true);

        @SuppressWarnings("serial")
        final JPanel panel = new JPanel() {
            protected void paintComponent(Graphics gx) {
                Graphics2D g = (Graphics2D) gx;
                int width  = getWidth();
                int height = getHeight();
                g.clearRect(0, 0, width, height);
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                draw(g, width, height);
            }
        };

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize(d.width / 2, d.height / 2);
        window.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        window.setContentPane(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
