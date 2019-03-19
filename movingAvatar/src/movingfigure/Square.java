package movingfigure;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Figure {

    private int length;
    
    public Square(int xA, int yA, int sideLength) {
        super(xA, yA);
        
        
        length = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
       
         //graphics.setColor(Color.BLACK);
        
        graphics.fillRect(x, y, length, length );
        
    }

    
     


}
