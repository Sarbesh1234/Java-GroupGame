import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends GameWorld
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        super(width, height, 1, false); 

        Text t = new Text();
        addObject(t,getWidth()/2,getHeight()/2);

        Text3 t2 = new Text3();
        addObject(t2,450,600);
    }

    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Level1World());
        }

        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new InstructionsScreen());
        }
    }
}
