import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    private State s = null;
    
    public GameWorld(int w, int h, int cellsize,boolean bounded) {
        super(w, h, cellsize,bounded); 
    }
    
    public GameWorld(int w, int h, int cellsize) {
        super(w, h, cellsize); 
    }
    
    
    
    public void setState(State a) {
        if(s != null) {
            s.onRemove();
            
            
        }
        s = a;
        s.onSet();
    }
    
    public void act() {
        if(s!=null) {
            s.onAct();
        }
    }
}
