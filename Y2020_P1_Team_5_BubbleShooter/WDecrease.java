import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WDecrease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WDecrease extends Actor
{
    /**
     * Act - do whatever the WDecrease wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            GameWorld.width = GameWorld.width - 50;
            Greenfoot.setWorld(new StartScreen());
        }
    }    
}
