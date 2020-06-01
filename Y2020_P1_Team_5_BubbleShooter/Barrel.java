import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel extends Foreground
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 50;
    public void act() 
    {
        if(getOneIntersectingObject(Laser.class) != null){
            removeTouching(Laser.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("118693__blackie666__fx9.wav");
        } else if(isTouching(BigLaser.class)) {
            if(getWorld().getObjects(Text9.class).size() == 0) {
                Greenfoot.playSound("explosion.wav");
                getWorld().removeObject(this);
            }
        }
    } 
}
