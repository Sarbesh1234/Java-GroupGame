import greenfoot.*;
public class Laser extends Actor{
    private int speed = 16;
    private int lasersLeft = 5;
    
    
    public void act(){
        scaleImage();
        moveLaser();
        outOfWorld();
    }
    
    public void scaleImage(){
        if(getWorld().getObjects(Laser.class).size() > 0){
            this.getImage().scale(20,20);
        }
    }
    
    public void moveLaser(){
        setLocation(getX(), getY() - speed);
    }
    
    public void outOfWorld(){
        if(getY() <= 0){
            getWorld().removeObject(this);
        }
    }
}

