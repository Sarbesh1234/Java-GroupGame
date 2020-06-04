import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends GameWorld
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    

        Text t = new Text();
        addObject(t,getWidth()/2,getHeight()/2);

        Text3 t2 = new Text3();
        addObject(t2,getWidth()/2,t.getY() + 2*t2.getImage().getHeight());
    }

    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Level1World());
        }

        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new InstructionsScreen());
        }
        WDecrease wde = new WDecrease();
        HDecrease hde = new HDecrease();
        addObject(new WIncrease(), getWidth()/2 + 100, getHeight()/2  - 200);
        addObject(wde, getWidth()/2 - 100, getHeight()/2  - 200);
        addObject(hde, getWidth()/2 - 100, getHeight()/2  - 100);
        addObject(new HIncrease(), getWidth()/2 + 100, getHeight()/2  - 100);

        addObject(new Text13(), wde.getX() + 100, wde.getY());
        addObject(new Text14(), hde.getX() + 100, hde.getY());

    }
}
