package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    
    private Figure figure;
    
    public DrawingBoard(Figure f) {
        
        figure = f;
        
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        
        super.paintComponent(graphics);
       
       
        figure.draw( graphics);
        
        
       
    }
}
