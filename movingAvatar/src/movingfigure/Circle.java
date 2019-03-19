package movingfigure;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure {

    
    
    private int diameter;
    
    public Circle( int xA, int yA, int diameterA){
        
        super( xA, yA );
        
        diameter = diameterA;
        
        
    }
    
    @Override
    public void draw(Graphics graphics) {
      
        graphics.setColor(Color.BLACK);
        
        graphics.fillOval(x, y, diameter, diameter );
        
        
      //  super.paintComponent(graphics);
        
        // fillOval of diameter at x, y
        
    }



}
