import greenfoot.*;
public class GameState extends State 
{
    // instance variables - replace the example below with your own
    private int x;
                                                                                        
    /**
     * Constructor for objects of class GameState
     */
    public GameState(GameWorld g)
    {
        super(g);
    }
    
    public void onSet() {
        Player player = new Player();
        getWorld().addObject(player, getWorld().getWidth()/2, getWorld().getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);
        
    }
}