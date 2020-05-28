import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        
        Skull s = new Skull();
        s.getImage().scale(300,300);
        addObject(s,getWidth()/2,getHeight()/2);
        
        GameOverText t = new GameOverText();
        addObject(t,450,800);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("R")) {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
