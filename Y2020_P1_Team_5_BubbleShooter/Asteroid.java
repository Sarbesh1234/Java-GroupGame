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
    
    public void act() 
    {
        moveAsteroid();
        collision();
    }    

    public void collision() {
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }
    }
    
    public void moveAsteroid(){
        setLocation(getX(),getY() + speed + 1);
    }
}

