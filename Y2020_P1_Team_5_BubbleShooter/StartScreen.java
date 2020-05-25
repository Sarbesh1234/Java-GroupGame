import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        
         Text t = new Text();
        addObject(t,getWidth()/2,getHeight()/2);
        
         Text3 t2 = new Text3();
        addObject(t2,450,600);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            
            Greenfoot.setWorld(new MyWorld());
        }
        
        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new InstructionsScreen());
        }
    }
}
