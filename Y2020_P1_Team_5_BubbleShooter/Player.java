import greenfoot.*;
public class Player extends Foreground
{
    //Hello tessting
    GreenfootImage img = getImage();
    //public int life = 10; 
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
            Level1World myWorld = (Level1World)getWorld();
            Lives l = myWorld.getLives();
            l.die();
            removeTouching(Level1Asteroid.class);
            }
        }

        if(getWorld().getObjects(Text9.class).size() == 0) {
            if(getOneIntersectingObject(Level2Asteroid.class) !=null) {
                Level2World myWorld = (Level2World)getWorld();
                Lives l = myWorld.getLives();
                l.die();
                removeTouching(Level2Asteroid.class);
            }
        }
        
        if(getWorld().getObjects(Text11.class).size() == 1) {
            if(getOneIntersectingObject(Level3Asteroid.class) !=null) {
                Level3World myWorld = (Level3World)getWorld();
                Lives l = myWorld.getLives();
                l.die();
                removeTouching(Level3Asteroid.class);
            }
        }else {
            if(getOneIntersectingObject(Level4Asteroid.class) !=null) {
                Level4World myWorld = (Level4World)getWorld();
                Lives l = myWorld.getLives();
                l.die();
                removeTouching(Level4Asteroid.class);
            }
        }
        
        if(getWorld().getObjects(Text11.class).size() == 1) {
            if(getOneIntersectingObject(Alien.class) != null) {
            Level3World myWorld = (Level3World)getWorld();
            Lives l = myWorld.getLives();
            l.die();
            removeTouching(Alien.class);
        }
        }
        
        if(getWorld().getObjects(Text9.class).size() == 1) {
            if(getOneIntersectingObject(Alien.class) != null) {
                Level4World myWorld = (Level4World)getWorld();
                Lives l = myWorld.getLives();
                l.die();
                removeTouching(Alien.class);
            }
        }
        
        if(getOneIntersectingObject(Bullet.class) != null) {
                Level4World myWorld = (Level4World)getWorld();
                Lives l = myWorld.getLives();
                l.die();
                removeTouching(Bullet.class);
        }
    }

    public void shoot(){
        MouseInfo m = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(null)) {
            if(getWorld().getObjects(Laser.class).size() == 0 && 
            getWorld().getObjects(ExplodingBomb.class).size() == 0){
                if(Greenfoot.getRandomNumber(100) < 50){
                    ExplodingBomb ebomb = new ExplodingBomb();
                    ebomb.setRotation(getRotation());
                    getWorld().addObject(ebomb, getX(), getY() - getImage().getHeight()/2);
                } else {
                    Laser laser = new Laser();
                    laser.setRotation(getRotation());
                    getWorld().addObject(laser, getX(), getY() - getImage().getHeight()/2);
                }
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