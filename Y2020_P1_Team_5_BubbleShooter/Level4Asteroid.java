import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4Asteroid extends Foreground
{
    private int speed = Greenfoot.getRandomNumber(7) + 3;

    public void collision() {
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            Level4World myWorld = (Level4World)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);       
        }else {
            if(getY()>=getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }
    }

    public void act() 
    {
        moveAsteroid();
        collision();
    }

    public void moveAsteroid(){
        setLocation(getX(),getY() + speed + 1);
    }
}

