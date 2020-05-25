import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    
    public Counter() {
       setImage(new GreenfootImage("Score: " + score+"/30", 30,Color.PINK,Color.BLACK));       
    }
    
    
    public void act() 
    {
        setImage(new GreenfootImage("Score: " + score+"/30", 30,Color.PINK,Color.BLACK));
        
        if(score == 2) {
            if(getWorld().getObjects(Text8.class).size() == 0) {
                Greenfoot.setWorld(new MyWorld2());
            }else {
                Greenfoot.setWorld(new MyWorld3());
            }
            
        }
    }
    
    public void addScore() {
        score++;
    }
}
