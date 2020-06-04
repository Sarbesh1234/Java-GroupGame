import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HDecrease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HDecrease extends Actor
{
    /**
     * Act - do whatever the HDecrease wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            GameWorld.height = GameWorld.height - 50;
            Greenfoot.setWorld(new StartScreen());
        }
    }    
}
