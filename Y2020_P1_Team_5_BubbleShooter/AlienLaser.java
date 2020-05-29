import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienLaser extends Actor
{
    private int speed = 10;

    
    public void act(){
        moveLaser();
        outOfWorld();
    }

    public void moveLaser(){
        setLocation(getX(),getY()+speed);
    }

    public void outOfWorld(){
        if(getY() <= 0 || getY()>=getWorld().getHeight()-1 || getX()>=getWorld().getWidth()-1 || getX()<=0){
            getWorld().removeObject(this);
        }
    }
}
