import greenfoot.*;
public class Player extends Actor
{
    GreenfootImage img = getImage();
    int life = 3;
    Boolean keydown = false;
    
    public void act(){
        
        int h = img.getHeight();
        int wi = img.getWidth();

        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        } else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }

        if(getY()+h/2>getWorld().getHeight()) {
            setLocation(getX(),getWorld().getHeight()-h/2);
        }
        if(getY()-h/2<(getWorld().getHeight()/5)*4) {
            setLocation(getX(),(getWorld().getHeight()/5)*4+h/2);
        }

        asteroidHit();
        shoot();
    }    

    public void asteroidHit(){
        if(getOneIntersectingObject(Asteroid.class) != null){
            life = life - 1;
        }
        
        if(life == 0){
            getWorld().removeObject(this);
            Greenfoot.stop(); 
        }
    }
    
    public void shoot(){
        if(Greenfoot.isKeyDown("space")){
            if(getWorld().getObjects(Laser.class).size() == 0){
                Laser laser = new Laser();
                getWorld().addObject(laser, getX(), getY() - getImage().getHeight()/2);
            }
        }
    }
}

