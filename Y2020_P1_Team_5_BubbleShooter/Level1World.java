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
    Lives l = new Lives();
    Text7 t = new Text7();
    int counterx = counter.getImage().getWidth()/2 + 20;
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

    public Level1World()
    {    

        super(900, 900, 1,false); 

        setPaintOrder(Foreground.class, Background.class);

        addObject(player, getWidth()/2, getHeight() - player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        addObject(counter,counterx, countery);
        addObject(l,lifex, lifey);
        addObject(t,tx, ty);
        
        Background back = new Background();
        addObject(back, backx, backy);
        Background back2 = new Background();
        addObject(back2, back2x, back2y);
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(200) <= 15){
            Level1Asteroid asteroid1 = new Level1Asteroid();
            addObject(asteroid1, 
                Greenfoot.getRandomNumber(getWidth() - 2*asteroid1.getImage().getWidth())
                + asteroid1.getImage().getWidth(), 0);
        }
    }

    public void act() {
        addAsteroid();
    }
}

