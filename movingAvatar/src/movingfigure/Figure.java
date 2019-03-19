package movingfigure;

import java.awt.Graphics;

public abstract class Figure {

    int x;
    
    int y;
    
    public Figure( int xA, int yA){
        
        x = xA;
        
        y = yA;
    }
    

    public void move( int dx , int dy){
        
        x = x + dx;
        
        y = y + dy;
        
        
    }
    
    public int getX(){
        
        return x;
    }
    
    public int getY(){
        
        return y;

}
    
     public abstract void draw(Graphics graphics);
}
