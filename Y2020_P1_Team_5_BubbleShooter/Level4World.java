import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level4World extends GameWorld
{
    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    EvilStar e = new EvilStar();
    int ex = getWidth()/2;
    int ey = 25;
    HealthBar healthbar = new HealthBar();
    public int evilStarY = 50;
    Lives l = new Lives();
    int counterx = counter.getImage().getWidth()/2 + 20;
    int countery = 56;
    int lifex = l.getImage().getWidth()/2;
    int lifey = getHeight() - l.getImage().getHeight()/2;
    int tx = 75;
    int ty = 90;
    int backx = getWidth()/2;
    int backy = getHeight()/2;
    int back2x = getWidth()/2;
    int back2y = -getHeight()/2;
    public Counter getCounter() {
        return counter;
    }

    public Lives getLives() {
        return l;
    }

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public Level4World()

    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.     
        setPaintOrder(Foreground.class, Background.class);
        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        addObject(e,ex,ey);

        Text9 t = new Text9();
        addObject(t,tx,ty);
        addObject(l,lifex, lifey);

        Background back = new Background();
        addObject(back, backx, backy);
        Background back2 = new Background();
        addObject(back2, back2x, back2y);
    }

    public HealthBar getHealthBar() {
        return healthbar;
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 15){
            Level4Asteroid asteroid4 = new Level4Asteroid();
            addObject(asteroid4, 
                Greenfoot.getRandomNumber(getWidth() - 2*asteroid4.getImage().getWidth())
                + asteroid4.getImage().getWidth(), 0);
        }
    }

    public void addAlien(){
        if(Greenfoot.getRandomNumber(110) < 5){
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
