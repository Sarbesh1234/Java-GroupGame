import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 6;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    
    
    public HealthBar() {
        update();
    }
    
    public void act() 
    {
        update();
        
        if(health==0) {
            Greenfoot.setWorld(new WinScreen());
        }
    }
    
    public void update() {
        setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
        
    }
    
    public void loseHealth() {
        health--;
    }
}