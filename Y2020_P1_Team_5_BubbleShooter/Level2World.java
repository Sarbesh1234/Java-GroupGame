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
    int counterx = counter.getImage().getWidth()/2;
    int countery = 56;
    int lifex = l.getImage().getWidth()/2;
    int lifey = 800;
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

    public Level2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1,false); 

        setPaintOrder(Foreground.class, Background.class);

        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        Text8 t = new Text8();
        addObject(counter,counterx, countery);
        addObject(t,tx, ty);
        addObject(l,lifex, lifey);

        Background back = new Background();
        addObject(back, backx, backy);
        Background back2 = new Background();
        addObject(back2, back2x, back2y);
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(200) <= 40){
            Level2Asteroid asteroid2 = new Level2Asteroid();
            addObject(asteroid2, 
                Greenfoot.getRandomNumber(getWidth() - 2*asteroid2.getImage().getWidth())
                + asteroid2.getImage().getWidth(), 0);
        }
    }

    public void act() {
        addAsteroid();
    }
}

