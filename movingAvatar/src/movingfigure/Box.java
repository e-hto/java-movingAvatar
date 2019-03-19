package movingfigure;

import java.awt.Graphics;

public class Box extends Figure {

    private int width;
    
    private int height; 
    
public Box(int x, int y, int w, int h){
         
    super( x , y);
    
    width = w;
    
    height = h;
         
         
     }

    @Override
    public void draw(Graphics graphics) {
      
        
        graphics.fillRect(x, y, width, height );
        
    }

}
