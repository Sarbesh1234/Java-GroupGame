import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Asteroid extends Foreground
{
    private int speed = Greenfoot.getRandomNumber(5);
    private int a = 0;
    public void asteroidFunction() {
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            Level1World myWorld = (Level1World)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            a++;
        } else if(isTouching(ExplodingBomb.class)){
            removeTouching(ExplodingBomb.class);
            Level1World myWorld = (Level1World)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            spawnExplosion();
        } else {
            if(getY()>=getWorld().getHeight()-1) {
                getWorld().removeObject(this);
            }
        }
    }

    public void act() 
    {
        moveAsteroid();
        asteroidFunction();
        scaleAsteroid();
    }

    public void moveAsteroid(){
        setLocation(getX(),getY() + speed + 1);
    }

    public void scaleAsteroid(){
        this.getImage().scale(50,50);
    }
    
    public void spawnExplosion(){
        Explosion exp = new Explosion();
        exp.setLocation(getX(),getY());
        getWorld().removeObjects(getObjectsInRange(exp.getImage().getWidth(), Level1Asteroid.class));
    }
}

