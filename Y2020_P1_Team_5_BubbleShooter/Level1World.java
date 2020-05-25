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
    public Counter getCounter() {
        return counter;
    }
    
    public Level1World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1,true); 
        

            

        
        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);
        
        Text7 t = new Text7();
        addObject(counter,75,56);
        addObject(t,75,90);
        //counter.setLocaation(69,32);
    }
    
    
    
    
    
    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 5){
            addObject(new Level1Asteroid(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    
    public void act() {
        addAsteroid();
    }

    }
    
    

