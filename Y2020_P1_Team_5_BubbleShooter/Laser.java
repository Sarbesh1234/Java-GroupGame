import greenfoot.*;
public class Laser extends Actor{
    private int speed = 10;
    public void act(){
        if(getWorld().getObjects(Laser.class).size() > 0){
            this.getImage().scale(20,20);
        }
        
        setLocation(getX(), getY() - speed);
        
        if(getY() <= 0){
            getWorld().removeObject(this);
        }
    }    
}

