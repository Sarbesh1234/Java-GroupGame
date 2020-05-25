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
    private int a = 0;
    public void collision() {
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            a++;
            
            //if(a == 20) {
            //    Greenfoot.setWorld(new MyWorld());
            //}
            
        }else {
            if(getY()>=getWorld().getHeight()-1) {
            getWorld().removeObject(this);
        }
        }
        
        /*if(isTouching(Bomb.class)) {
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }*/
        
        
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

