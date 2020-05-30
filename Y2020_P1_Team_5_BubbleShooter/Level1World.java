import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1World extends World
{

    Counter counter = new Counter();
    Player player = new Player();
    Background back = new Background();
    Background back2 = new Background();
    Lives l = new Lives();

    public Counter getCounter() {
        return counter;
    }
    
     public Lives getLives() {
        return l;
    }

    public Level1World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(900, 900, 1,true); 

        setPaintOrder(Foreground.class, Background.class);

        addObject(player, getWidth()/2, getHeight() - player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        Text7 t = new Text7();
        addObject(counter,75,56);
        addObject(l,90,800);
        addObject(t,75,90);

        addObject(back, getWidth()/2, getHeight()/2);
        addObject(back2, getWidth()/2, -getHeight()/2);
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 15){
            addObject(new Level1Asteroid(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }

    public void act() {
        addAsteroid();
        if(back.getY() - back.getImage().getHeight()/2 >= getHeight()){
            back.setLocation(getWidth()/2, -getHeight()/2);
        }
    }
}

