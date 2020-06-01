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
    Text11 t = new Text11();
    Alien alien = new Alien();
    Lives l = new Lives();
    private int wallNumber = 20;
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

    public Level3World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, false);
        setPaintOrder(Foreground.class, Background.class);
        addWall();

        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);

        addObject(counter,counterx, countery);
        addObject(t,tx, ty);
        addObject(l,lifex, lifey);

        Background back = new Background();
        addObject(back, backx, backy);
        Background back2 = new Background();
        addObject(back2, back2x, back2y);
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 20){
            Level3Asteroid asteroid3 = new Level3Asteroid();
            addObject(asteroid3, 
                Greenfoot.getRandomNumber(getWidth() - 2*asteroid3.getImage().getWidth())
                + asteroid3.getImage().getWidth(), 0);
        }
    }

    public void addAlien(){
        if(Greenfoot.getRandomNumber(300) <= 20){
            alien.setRotation(180);
            addObject(new Alien(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }

    public void act() {
        addAsteroid();
        addAlien();
    }

    public void addWall(){
        for(int i = 0; i <= wallNumber; i++){
            Barrel wall = new Barrel();
            wall.getImage().scale(50,50);
            int RandomX = Greenfoot.getRandomNumber(getWidth()/wall.getImage().getWidth());
            int RandomY = Greenfoot.getRandomNumber(getHeight()/wall.getImage().getHeight());

            addObject(wall, wall.getImage().getWidth()*RandomX + wall.getImage().getWidth()/2,
                wall.getImage().getHeight()*RandomY + wall.getImage().getHeight()/2);
        }
    }
}
