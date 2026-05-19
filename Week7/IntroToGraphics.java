import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * IntroToGraphics_Lines - Drawing with Lines
 *
 * HOW IT WORKS:
 *   The draw() method is called every time the window needs to refresh.
 *   'g' is a Graphics object - think of it as your paintbrush.
 *   'width' and 'height' are the pixel dimensions of the drawing area.
 *
 * 
 *   Only edit the draw() method below. Leave main() alone -
 *   it sets up the window and calls draw() for you automatically.
 *
 * COORDINATE SYSTEM:
 *   (0, 0) is the TOP-LEFT corner of the window.
 *   x increases going RIGHT 
 *   y increases going DOWN
 *   TOP LEFT corner is 0,0 
 *   BOTTOM-RIGHT corner is (width-1, height-1).
 *
 *        (0,0) -------------- x
 *          |
 *          |
 *          |
 *          y
 */
public class IntroToGraphics {


    // HELPER METHOD: randomColor()

    // This method generates a random Color each time it is called.
    // It picks three random integers between 0-255 for Red, Green, and Blue,
    // then bundles them into a Color object using new Color(r, g, b).
    //
    // You can call it like this:  g.setColor(randomColor());
    // =========================================================================
    public static Color randomColor() {
        int red   = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue  = (int)(Math.random() * 256);
        return new Color(red, green, blue);
    }

    // =========================================================================
    // draw() - PUT YOUR DRAWING CODE HERE
    // 
    // This method is called automatically whenever the window redraws itself.


    // Leave main() alone It sets up the drawing window for you.
    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics window - Lines");
        window.setLocationByPlatform(true);

        @SuppressWarnings("serial")
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics gx) {
                Graphics2D g = (Graphics2D) gx;
                int width  = getWidth();
                int height = getHeight();
                g.clearRect(0, 0, width, height);
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                //here is where the draw method gets called
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