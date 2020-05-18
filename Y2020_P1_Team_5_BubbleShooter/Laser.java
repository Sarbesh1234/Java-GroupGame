import greenfoot.*;
public class Laser extends Actor{
    public void act(){
        if(getWorld().getObjects(Laser.class).size() > 0){
            this.getImage().scale(20,20);
        }
        setLocation(getX(), getY() - 1);
        if(getY() <= 0){
            getWorld().removeObject(this);
        }
    }    
}

