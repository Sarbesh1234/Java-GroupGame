import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2World extends World
{
    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    Lives l = new Lives();
    public Counter getCounter() {
        return counter;
    }

    public Lives getLives() {
        return l;
    }

    public Level2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1,true); 

        
        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        Text8 t = new Text8();
        addObject(counter,75,56);
        addObject(t,75,90);
        addObject(l,90,800);

        //counter.setLocaation(69,32);
    }

    
    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(200) <= 40){
            Level2Asteroid asteroid2 = new Level2Asteroid();
            addObject(asteroid2, Greenfoot.getRandomNumber(getWidth() - 
            asteroid2.getImage().getWidth()/2), 0);
        }
    }

    public void act() {
        addAsteroid();
    }
}

