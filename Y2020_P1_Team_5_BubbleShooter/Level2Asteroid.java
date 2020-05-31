import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Asteroid extends Foreground
{
    private int speed = Greenfoot.getRandomNumber(7);

    public void collision() {

        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            Level2World myWorld = (Level2World)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);

        } else {
            if(getY()>=getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }

    }

    public void act() 
    {
        moveAsteroid();
        collision();
        scalelvl2Asteroid();
    }

    public void moveAsteroid(){
        setLocation(getX(),getY() + speed + 4);
    }

    public void scalelvl2Asteroid(){
        this.getImage().scale(30, 30);
    }
}

