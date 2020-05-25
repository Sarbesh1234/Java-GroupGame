import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    Counter counter = new Counter();
    Player player = new Player();
    Alien alien = new Alien();
    public Counter getCounter() {
        return counter;
    }
    
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1,true); 
        

            

        
        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);
        
        Text8 t = new Text8();
        addObject(counter,75,56);
        addObject(t,75,90);
        
       
        //counter.setLocaation(69,32);
    }
    
    
    
    
    
    public void addAstroid(){
        if(Greenfoot.getRandomNumber(100) <= 20){
            addObject(new Asteroid2(), Greenfoot.getRandomNumber(getWidth()), 0);
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
        addAlien();
        
    }
    
    public void pause() {
        while(!Greenfoot.isKeyDown("enter")) {
            Greenfoot.delay(1);
        }
    }

    }
    
    

