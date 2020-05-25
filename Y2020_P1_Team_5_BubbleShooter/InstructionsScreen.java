import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsScreen extends World
{
    
    
    public InstructionsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        
        
        
        
        Text4 t2 = new Text4();
        addObject(t2,450,300);
        
        Text5 t3 = new Text5();
        addObject(t3,450,400);
        
        Text6 t4 = new Text6();
        addObject(t4,450,500);
        
        
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
