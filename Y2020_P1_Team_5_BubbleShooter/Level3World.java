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
    Lives l = new Lives();
    private int wallNumber = 20;

    public Counter getCounter() {
        return counter;
    }

    public Lives getLives() {
        return l;
    }

    public Level3World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1);
        
        addWall();
        
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);

        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);

        addObject(counter,75,56);
        Text11 t = new Text11();
        addObject(t,75,90);
        addObject(l,90,800);
    }

    public void addAsteroid(){
        if(Greenfoot.getRandomNumber(100) <= 20){
            addObject(new Level3Asteroid(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }

    public void addAlien(){
        if(Greenfoot.getRandomNumber(200) <= 20){
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
            Wall wall = new Wall();
            wall.getImage().scale(50,50);
            int RandomX = Greenfoot.getRandomNumber(getWidth()/wall.getImage().getWidth());
            int RandomY = Greenfoot.getRandomNumber(getHeight()/wall.getImage().getHeight());

            addObject(wall, wall.getImage().getWidth()*RandomX + wall.getImage().getWidth()/2,
                wall.getImage().getHeight()*RandomY + wall.getImage().getHeight()/2);
        }
    }
}
