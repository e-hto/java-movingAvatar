package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList< Figure > figures = new ArrayList< Figure >();
    
    public CompoundFigure() {
        super(0,0);
        
        //edit this
    }

    @Override
    public void draw(Graphics graphics) {
        
       for ( Figure figure : figures){
           
           
           figure.draw(graphics);
       }
        
        
    }

    
    @Override
    public void move( int dx, int dy){
        
        for ( Figure figure : figures){
            
            figure.move(dx, dy);
            
        }
        
        
    }
    
    public void add( Figure figure){
        
        figures.add(figure);
        
    }

   
    

}
