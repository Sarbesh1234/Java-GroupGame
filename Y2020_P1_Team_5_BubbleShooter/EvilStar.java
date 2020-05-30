import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilStar extends Foreground
{
    private int dx = 5;
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) <= 4){
            Bullet b = new Bullet();
            b.setRotation(getRotation());
            getWorld().addObject(b, getX(), getY() - getImage().getHeight()/2);
        }

        touchLaser();
        moveBoss();
        outOfBounds();
    }

    public void moveBoss(){
        move(dx);
    }

    public void outOfBounds(){
        if(getX() + getImage().getWidth()/2 >= getWorld().getWidth()-1){
            turn(180);
        }

        if(getX() - getImage().getWidth()/2 <= 0){
            turn(180);
        }
    }

    public void touchLaser(){
        if(isTouching(Laser.class)) {
            removeTouching(Laser.class);
            World world = getWorld();
            Level4World myWorld = (Level4World)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
        }
    }
}
