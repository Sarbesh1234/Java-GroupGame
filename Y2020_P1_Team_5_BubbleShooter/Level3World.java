import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level3World extends World
{
    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    EvilStar e = new EvilStar();
    HealthBar healthbar = new HealthBar();
    public int evilStarY = 50;
    public Counter getCounter() {
        return counter;
    }

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public Level3World()

    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 

        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        addObject(e,getWidth()/2,25);

        Text9 t = new Text9();
        addObject(t,75,90);
    }

    public HealthBar getHealthBar() {
        return healthbar;
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 7){
            addObject(new Level3Asteroid(), Greenfoot.getRandomNumber(getWidth()), 0);
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
        addObject(healthbar,getWidth()/2,evilStarY);
        addAlien();
    }
}
