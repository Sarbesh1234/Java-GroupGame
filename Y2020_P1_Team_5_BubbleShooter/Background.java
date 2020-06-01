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
    private int speed = 5;
    public Background(){
        
    }

    public void act() 
    {
        setLocation(getX(), getY() + speed);
        
        if(getY() - getImage().getHeight() / 2 >= getWorld().getHeight()){
            setLocation(getWorld().getWidth()/2, -getImage().getHeight() / 2);
        }
    }

    protected void addedToWorld(World world){
        GreenfootImage img = getImage();
        img.scale(getWorld().getWidth(),getWorld().getHeight());
    }
}
