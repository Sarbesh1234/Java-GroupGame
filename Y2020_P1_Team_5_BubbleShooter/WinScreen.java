import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    int t2x = getWidth()/2;
    int t2y = getHeight()/2 - 200;
    
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 

        Text10 t = new Text10();

        addObject(t,getWidth()/2,getHeight()/2);

        Text12 t2 = new Text12();
        addObject(t2, t2x, t2y);
    }

    public void act(){
        if(Greenfoot.isKeyDown("R")) {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
