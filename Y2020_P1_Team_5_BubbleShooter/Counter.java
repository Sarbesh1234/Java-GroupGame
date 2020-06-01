import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Foreground
{
    int score = 0;

    public Counter() {
        setImage(new GreenfootImage("Score: " + score+"/15 to next lvl", 30,Color.PINK,Color.BLACK));       
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score: " + score+"/15 to next lvl", 30,Color.PINK,Color.BLACK));
        if(score == 15) {
            if(getWorld().getObjects(Text7.class).size() == 1) {
                Greenfoot.setWorld(new Level2World());
            }else if (getWorld().getObjects(Text8.class).size() == 1) {
                Greenfoot.setWorld(new Level3World());
            }else if(getWorld().getObjects(Text11.class).size() == 1) {
                Greenfoot.setWorld(new Level4World());
            }
        }
    }

    public void addScore() {
        score++;
    }
}
