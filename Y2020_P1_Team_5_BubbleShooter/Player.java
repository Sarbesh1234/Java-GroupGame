import greenfoot.*;
public class Player extends Actor
{
    //Hello tessting
    GreenfootImage img = getImage();
    public int life = 10; 
    int h = img.getHeight();
    int wi = img.getWidth();
    private int speed = 15;

    public void act(){
        movePlayer();
        outOfBounds();
        hitObjects();
        shoot();
        rotate();
    }

    public void rotate() {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            turnTowards(m.getX(), m.getY());
        }
    }

    public void hitObjects(){
        if(getWorld().getObjects(Text8.class).size() == 0) {
            if(getOneIntersectingObject(Level1Asteroid.class) != null){
                life = life - 1;
                removeTouching(Level1Asteroid.class);
            }
        }

        if(getWorld().getObjects(Text9.class).size() == 0) {
            if(getOneIntersectingObject(Level2Asteroid.class) !=null) {
                life = life - 2;
                removeTouching(Level2Asteroid.class);
            }
        }else {
            if(getOneIntersectingObject(Level3Asteroid.class) !=null) {
                life = life - 3;
                removeTouching(Level3Asteroid.class);
            }
        }

        if(getOneIntersectingObject(Alien.class) != null) {
            life = life - 2;
            removeTouching(Alien.class);
        }

        if(getOneIntersectingObject(AlienLaser.class) != null) {
            life = life - 1;
            removeTouching(AlienLaser.class);
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