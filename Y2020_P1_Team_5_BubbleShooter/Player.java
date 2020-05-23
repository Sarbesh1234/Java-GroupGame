import greenfoot.*;
public class Player extends Actor
{
    //Hello tessting
    GreenfootImage img = getImage();
    int life = 3; 
    int h = img.getHeight();
    int wi = img.getWidth();
    private int speed = 10;
    private int lasersLeft = 6;
    
    private int x = -90;
    private int y = -90;
    
    public void act(){
        movePlayer();
        outOfBounds();
        asteroidHit();
        shoot();
        rotate();
    }
    
    public void rotate() {
        
        if(Greenfoot.isKeyDown("a")) {
            setRotation(x);
            x-=10;
        }
        
        if(Greenfoot.isKeyDown("d")) {
            setRotation(x);
            x+=10;
        }
    }

    public void asteroidHit(){
        if(getOneIntersectingObject(Asteroid.class) != null){
            life = life - 1;
        }

        if(life == 0){
            getWorld().removeObject(this);
            Greenfoot.stop(); 
        }
    }
    
    public void shoot(){
        if(Greenfoot.isKeyDown("space")){
            
            if(getWorld().getObjects(Laser.class).size() == 0){
                Laser laser = new Laser();
                getWorld().addObject(laser, getX(), getY() - getImage().getHeight()/2);
                lasersLeft--;
            }
            
            if(lasersLeft == 0) {
                Greenfoot.stop();
            }
        }
    }
    
    public void movePlayer(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
        } else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - speed);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void outOfBounds(){
        if(getY()+h/2>getWorld().getHeight()) {
            setLocation(getX(),getWorld().getHeight()-h/2);
        }
        //if(getY()-h/2<(getWorld().getHeight())) {
        //    setLocation(getX(),(getWorld().getHeight())+h/2);
        //}
    }
}