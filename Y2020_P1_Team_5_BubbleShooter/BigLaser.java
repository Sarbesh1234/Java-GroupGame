import greenfoot.*;
/**
 * Write a description of class BigLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigLaser  extends Player
{
    private int speed = 20;

    public void act(){
        moveBLaser();
        outOfWorld();
    }

    public void collision() {
        Actor EvilStar = getOneIntersectingObject(EvilStar.class);

        if(EvilStar!=null) {
            World world = getWorld();
            Level4World myWorld = (Level4World)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
        }
    }

    public void moveBLaser(){
        move(speed);
    }

    public void outOfWorld(){
        if(getY() <= 0 || getY()>=getWorld().getHeight()-1 || getX()>=getWorld().getWidth()-1 || getX()<=0){
            getWorld().removeObject(this);
        }
    }
}
