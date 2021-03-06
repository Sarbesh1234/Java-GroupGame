import greenfoot.*;
public class Laser extends Player{
    private int speed = 20;
    
    
    public void act(){
        scaleImage();
        moveLaser();
        outOfWorld();
    }
    
    public void collision() {
        Actor EvilStar = getOneIntersectingObject(EvilStar.class);
        
        if(EvilStar!=null) {
            World world = getWorld();
            Level4World myWorld = (Level4World)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
        }
    }
    
    public void scaleImage(){
        if(getWorld().getObjects(Laser.class).size() > 0){
            this.getImage().scale(20,20);
        }
    }
    
    public void moveLaser(){
        move(speed);
    }
    
    public void outOfWorld(){
        if(getY() <= 0 || getY()>=getWorld().getHeight()-1 || getX()>=getWorld().getWidth()-1 || getX()<=0){
            getWorld().removeObject(this);
        }
    }
}

