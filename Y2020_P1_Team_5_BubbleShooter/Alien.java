import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Foreground
{
    private int speed = 5;

    public void rotateAlien() {
        setRotation(90);
    }

    public void collision() {
        if(isTouching(Laser.class)) {
            if(getWorld().getObjects(Text9.class).size() == 0) {
                removeTouching(Laser.class);
                Level3World myWorld = (Level3World)getWorld();
                Greenfoot.playSound("118693__blackie666__fx9.wav");
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }else {
                removeTouching(Laser.class);
                Level4World myWorld = (Level4World)getWorld();
                Greenfoot.playSound("118693__blackie666__fx9.wav");
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }
        } else if(isTouching(BigLaser.class)) {
            if(getWorld().getObjects(Text9.class).size() == 0) {
                Level3World myWorld = (Level3World)getWorld();
                Greenfoot.playSound("explosion.wav");
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }else {
                Level4World myWorld = (Level4World)getWorld();
                Greenfoot.playSound("118693__blackie666__fx9.wav");
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }
        } else {
            if(getY()>=getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }
    }

    public void act() 
    {
        moveAlien();
        rotateAlien();
        collision();

    }

    public void moveAlien(){
        setLocation(getX(),getY() + speed + 1);
    }


}