import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3World extends World
{
    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    /**
     * Constructor for objects of class Level3World.
     * 
     */
    public Level3World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 20){
            addObject(new Level2Asteroid(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }

    public void addAlien(){
        if(Greenfoot.getRandomNumber(100) <= 2){
            alien.setRotation(180);
            addObject(new Alien(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }

    public void act() {
        addAsteroid();
        addAlien();

    }
}
