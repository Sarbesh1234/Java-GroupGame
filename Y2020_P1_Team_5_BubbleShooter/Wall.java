import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Foreground
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(Laser.class) != null){
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        } else if(getOneIntersectingObject(ExplodingBomb.class) != null){
            removeTouching(ExplodingBomb.class);
            getWorld().removeObject(this);
        }
    }    
}
