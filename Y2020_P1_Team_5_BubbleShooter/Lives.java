import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Foreground
{
    int lives = 6;
    
    public Lives() {
        setImage(new GreenfootImage("Lives Left: " + lives, 30,Color.PINK,Color.BLACK));       
    }

    public void act() 
    {
        setImage(new GreenfootImage("Lives Left: " + lives, 30,Color.PINK,Color.BLACK));

        if(lives == 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }

    public void die() {
        lives--;
    }
}
