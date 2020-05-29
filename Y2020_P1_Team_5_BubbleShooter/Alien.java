import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    private int speed = 5;

    public void rotateAlien() {
        setRotation(90);
    }

    public void collision() {
        if(isTouching(Laser.class)) {
            if(getWorld().getObjects(Text9.class).size() == 0) {
                removeTouching(Laser.class);
                Level2World myWorld = (Level2World)getWorld();
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }else {
                removeTouching(Laser.class);
                Level4World myWorld = (Level4World)getWorld();
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }

        }else {
            if(getY()>=getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }
    }

    public void act() 
    {
        moveAlien();
        collision();
        rotateAlien(); 
    }

    public void moveAlien(){
        setLocation(getX(),getY() + speed + 1);
    }
}