import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    private int speed = Greenfoot.getRandomNumber(3);
    private int hit = 0;
    private int healthbar = 0;
    
    public void act() 
    {
        setLocation(getX(),getY() + speed + 1);
        
        if(getY()>=getWorld().getHeight()-10) {
            setLocation(getX(),0 - getImage().getHeight());
        }
        
        collision();
    }    

    public void collision() {
        if(isTouching(Laser.class)) {
            healthbar--;
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }
        
        if(healthbar == -10) {
            getWorld().removeObject(this);
        } 
    }
}

