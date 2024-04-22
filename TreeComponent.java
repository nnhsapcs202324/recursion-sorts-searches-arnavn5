import javax.swing.JComponent;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.geom.Line2D;

/**
 * Write a description of class TreeComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeComponent extends JPanel
{
    private final int Width = 800;
    private final int Height = 1000;
    
    private final int startX= 150;
    private final int startY= 20;
    private int order;
    private Color purple = new Color(200,29,255);
    private Color white = new Color(255, 255, 255);
    
    public TreeComponent()
    {
        setBackground (Color.BLACK);
        setPreferredSize (new Dimension(Width, Height));
    }
    public void drawFractalTree(double x, double y, double length, double angle, Graphics2D g2){
        double radians = Math.toRadians(angle);
        
        double xValue = Math.cos(radians) * length;
        double yValue = Math.sin(radians) * length;
        double currentX = x + xValue;
        double currentY = y + yValue;
        
        if (length >.1)
        {
            Line2D.Double newLine = new Line2D.Double (x,y,currentX, currentY);
            g2.draw(newLine);
            drawFractalTree(currentX, currentY, length * .7, angle + 15, g2);
            drawFractalTree(currentX, currentY, length* .7, angle - 15, g2);
        }
    }
    @Override
    public void paintComponent(Graphics g2)
    {
        super.paintComponent(g2);
        g2.setColor(purple);
        Graphics2D g3 = (Graphics2D) g2;
        Line2D.Double treeTrunk = new Line2D.Double(400,350, 400, 650);
        g3.setColor(white);
        g3.draw(treeTrunk);
        g3.setColor(purple);
        
        //first tree
        drawFractalTree(400, 350, 60, 210, g3);
        drawFractalTree(400, 350, 60, 240, g3);
        drawFractalTree(400, 350, 60, 270, g3);
        drawFractalTree(400, 350, 60, 300, g3);
        drawFractalTree(400, 350, 60, 330, g3);
        
        
        drawFractalTree(400, 650, 60, 390, g3);
        drawFractalTree(400, 650, 60, 420, g3);
        drawFractalTree(400, 650, 60, 450, g3);
        drawFractalTree(400, 650, 60, 480, g3);
        drawFractalTree(400, 650, 60, 510, g3);
        
        //second tree
        Line2D.Double treeTrunk1 = new Line2D.Double(100,500, 100, 650);
        g3.setColor(purple);
        g3.draw(treeTrunk1);
        g3.setColor(white);
        drawFractalTree(100, 500, 30, 210, g3);
        drawFractalTree(100, 500, 30, 240, g3);
        drawFractalTree(100, 500, 30, 270, g3);
        drawFractalTree(100, 500, 30, 300, g3);
        drawFractalTree(100, 500, 30, 330, g3);
        
        //third tree
        //second tree
        Line2D.Double treeTrunk2 = new Line2D.Double(700,500, 700, 650);
        g3.setColor(purple);
        g3.draw(treeTrunk2);
        g3.setColor(white);
        drawFractalTree(700, 500, 30, 210, g3);
        drawFractalTree(700, 500, 30, 240, g3);
        drawFractalTree(700, 500, 30, 270, g3);
        drawFractalTree(700, 500, 30, 300, g3);
        drawFractalTree(700, 500, 30, 330, g3);
}
} 
    
