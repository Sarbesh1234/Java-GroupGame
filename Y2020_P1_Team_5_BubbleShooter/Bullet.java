import greenfoot.*;
public class Bullet extends EvilStar{
    private int speed = 5;

    public void act(){
        scaleImage();
        moveBullet();
        outOfWorld();
        collision();
    }

    public void collision() {
        if(isTouching(Laser.class)) {
            if(getWorld().getObjects(Text10.class).size() == 0) {
                removeTouching(Laser.class);
                Greenfoot.playSound("118693__blackie666__fx9.wav");
                getWorld().removeObject(this);
            }
        }else if(isTouching(BigLaser.class)) {
            if(getWorld().getObjects(Text10.class).size() == 0) {
                Greenfoot.playSound("explosion.wav");
                getWorld().removeObject(this);
            }
        } else {
            if(getY()>=getWorld().getHeight()-30) {
                getWorld().removeObject(this);
            }
        }
    }

    public void scaleImage(){
        if(getWorld().getObjects(Bullet.class).size() > 0){
            this.getImage().scale(50,50);
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

