import greenfoot.*;
public class Laser extends Actor{
    private int speed = 20;
    boolean touchBaby = false;
    
    
    public void act(){
        scaleImage();
        moveLaser();
        outOfWorld();
        
        //if(getWorld().getObjects(Text7.class).size() == 0) {
        //   collision();
        //}
    }
    
    public void collision() {
        Actor EvilStar = getOneIntersectingObject(EvilStar.class);
        
        if(EvilStar!=null) {
            World world = getWorld();
            Level3World myWorld = (Level3World)world;
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

