    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Alien here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Alien extends Actor
    {
    private int speed = 5;
    
    public void rotateAlien() {
        setRotation(90);
    }
    
    public void collision() {
        if(isTouching(Laser.class)) {
            if(getWorld().getObjects(Text9.class).size() == 0) {
                removeTouching(Laser.class);
                Level2World myWorld = (Level2World)getWorld();
                Counter counter = myWorld.getCounter();
                   counter.addScore();
                getWorld().removeObject(this);
            }else {
                removeTouching(Laser.class);
                Level3World myWorld = (Level3World)getWorld();
                Counter counter = myWorld.getCounter();
                counter.addScore();
                getWorld().removeObject(this);
            }
            
            
        }else {
            if(getY()>=getWorld().getHeight()-1) {
            getWorld().removeObject(this);
        }
        }
   
        
    
        
        /*if(isTouching(Bomb.class)) {
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }*/
        
        
    }
    
    public void act() 
    {
        moveAlien();
        collision();
        rotateAlien();
        if(Greenfoot.getRandomNumber(100) == 1 && getWorld().getObjects(Text7.class).size() == 0) {
           EvilLaser l = new EvilLaser();
            getWorld().addObject(l, getX(), getY() - getImage().getHeight()/2);
        }
    }
    
    

    
    
    public void moveAlien(){
        setLocation(getX(),getY() + speed + 1);
    }
}
