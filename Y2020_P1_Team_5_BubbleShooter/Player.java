import greenfoot.*;
public class Player extends Actor
{
    //Hello tessting
    GreenfootImage img = getImage();
    int life = 3; 
    int h = img.getHeight();
    int wi = img.getWidth();
    private int speed = 15;
    public static int lasersLeft = 6;

    public void act(){
        movePlayer();
        outOfBounds();
        asteroidHit();
        shoot();
        rotate();
    }

    public void rotate() {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            turnTowards(m.getX(), m.getY());
        }
    }

    public void asteroidHit(){
        if(getWorld().getObjects(Text8.class).size() == 0) {
            if(getOneIntersectingObject(Level1Asteroid.class) != null){
                life = life - 1;
                Greenfoot.setWorld(new GameOver());
            }   
        }

        if(getWorld().getObjects(Text9.class).size() == 0) {
            if(getOneIntersectingObject(Level2Asteroid.class) !=null) {
                life = life-1;
                Greenfoot.setWorld(new GameOver());
            }
        }else {
            if(getOneIntersectingObject(Level3Asteroid.class) !=null) {
                life = life-1;
                //getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
            }
        }
        
        if(getOneIntersectingObject(Alien.class) != null) {
            life = life-1;
            //getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());
        }

        if(getOneIntersectingObject(EvilLaser.class) != null) {
            life = life-1;
            Greenfoot.setWorld(new GameOver());
        }

        if(life == 0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());
        }
    }

    public void shoot(){
        MouseInfo m = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(null)) {
            if(getWorld().getObjects(Laser.class).size() == 0){
                Laser laser = new Laser();
                laser.setRotation(getRotation());
                getWorld().addObject(laser, getX(), getY() - getImage().getHeight()/2);
            }
        }
    }

    public void movePlayer(){
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX() - speed, getY());
        }else if(Greenfoot.isKeyDown("D")){
            setLocation(getX() + speed, getY());
        } else if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() - speed);
        }else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() + speed);
        }
    }

    public void outOfBounds(){
        if(getY()+h/2>getWorld().getHeight()) {
            setLocation(getX(),getWorld().getHeight()-h/2);
        }
    }
}