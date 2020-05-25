import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld3 extends World
{
    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    EvilPlayer e = new EvilPlayer();
    HealthBar healthbar = new HealthBar();
    public Counter getCounter() {
        return counter;
    }
    
    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3()
    
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
    
     public void addAstroid(){
        if(Greenfoot.getRandomNumber(100) <= 40){
            addObject(new Astreroid3(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    
    public void addAlien(){
        if(Greenfoot.getRandomNumber(100) <= 2){
            alien.setRotation(180); //Why no rotate...
            addObject(new Alien(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    
    public void act() {
        addAstroid();
        addObject(healthbar,getWidth()/2,50);
        addAlien();
        
    }
}