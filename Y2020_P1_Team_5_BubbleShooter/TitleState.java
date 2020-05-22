import greenfoot.*;
public class TitleState extends State {
    
    private boolean spacePressed = false;

    /**
     * Constructor for objects of class TitleState
     */
    public TitleState(GameWorld g)
    {
        super(g);
    }
    
    public void onSet() {
        Text t = new Text();
        getWorld().addObject(t,getWorld().getWidth()/2,getWorld().getHeight()/2);
        
    }

    public void onAct() {
        if(Greenfoot.mouseClicked(null)) {
            getWorld().setState(new GameState(getWorld()));
        } ///else if(spacePressed) {
            //spacePressed = false;
        //}
    }
}
