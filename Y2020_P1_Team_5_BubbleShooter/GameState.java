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
        Asteroid[] asteroid = new Asteroid[40];
        
        for(int i=0; i<asteroid.length;i++) {
            asteroid[i] = new Asteroid();
            int asteroidX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int asteroidY = Greenfoot.getRandomNumber(getWorld().getHeight()/5*3);
            int random = Greenfoot.getRandomNumber(40) + 25;
            getWorld().addObject(asteroid[i],asteroidX,asteroidY);
            asteroid[i].getImage().scale(random, random);
        }
    }
}
