import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilPlayer extends Actor
{
    
    public void act() 
    {
        //setLocation(Greenfoot.getRandomNumber(900),getY());
        
        //Bullet b = new Bullet();
        //b.setRotation(getRotation());
        //getWorld().addObject(b, getX(), getY() - getImage().getHeight()/2);
        
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            World world = getWorld();
            MyWorld3 myWorld = (MyWorld3)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
        }
    }    
}
