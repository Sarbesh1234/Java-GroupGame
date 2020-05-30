import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Actor
{
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    public Background(){

    }

    public void act() 
    {
        setLocation(getX(), getY() + speed);
    }

    protected void addedToWorld(World world){
        GreenfootImage img = getImage();
        img.scale(getWorld().getWidth(),getWorld().getHeight());
    }

}
