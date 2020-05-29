import greenfoot.*;
public class Bullet extends EvilStar{
    private int speed = 10;
    
    public void act(){
        scaleImage();
        moveBullet();
        outOfWorld();
    }
    
    public void scaleImage(){
        if(getWorld().getObjects(Bullet.class).size() > 0){
            this.getImage().scale(30,30);
        }
    }
    
    public void moveBullet(){
        setLocation(getX(),getY()+speed);
    }
    
    public void outOfWorld(){
        if(getY() <= 0 || getY()>=getWorld().getHeight()-1 || getX()>=getWorld().getWidth()-1 || getX()<=0){
            getWorld().removeObject(this);
        }
    }
}

