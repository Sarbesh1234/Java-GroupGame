import greenfoot.*;
public class Player extends Actor
{
    World w = getWorld();
    GreenfootImage img = getImage();
    int h = img.getHeight();
    int wi = img.getWidth();
    int life = 3;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")){
            shoot();
        }
        
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        } else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }
        
        if(getX()<1) {
            setLocation(getWorld().getWidth()-10,getY());
        }
        
        if(getX()>getWorld().getWidth()-5) {
            setLocation(10,getY());
        }
        
        if(getY()+h/2>getWorld().getHeight()) {
            setLocation(getX(),getWorld().getHeight()-h/2);
        }
    if(getY()-h/2<(getWorld().getHeight()/5)*4) {
            setLocation(getX(),(getWorld().getHeight()/5)*4+h/2);
        }
        
        asteroidHit();
        
        if(life == 0){
            getWorld().removeObject(this);
            Greenfoot.stop(); 
        }
    }    
    
    public void shoot() {
        Laser l = new Laser();
        getWorld().addObject(l, getX(), getY() - getImage().getHeight()/2);
    }
    
    public void asteroidHit(){
        if(getOneIntersectingObject(Asteroid.class) != null){
            life = life - 1;
        }
    }
}

