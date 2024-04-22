
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TreeViewer
{
    private final int WIDTH = 1200;
    private final int HEIGHT = 1200;
    private JPanel panel, tools;
    private JFrame frame;
    private TreeComponent fractal;
    
    
    public TreeViewer()
    {
        fractal = new TreeComponent ();
        panel = new JPanel();
        panel.add(fractal);
        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
         TreeViewer viewer = new TreeViewer();
    }

   
}
