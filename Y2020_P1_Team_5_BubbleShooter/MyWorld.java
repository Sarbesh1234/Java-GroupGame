import greenfoot.*;
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(900, 900, 1);
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()-player.getImage().getHeight()/2);
        player.setRotation(-90); 
        player.getImage().scale(player.getImage().getWidth()/2, player.getImage().getHeight()/2);
        Asteroid[] asteroid = new Asteroid[40];
        
        for(int i=0; i<asteroid.length;i++) {
            asteroid[i] = new Asteroid();
            int asteroidX = Greenfoot.getRandomNumber(getWidth());
            int asteroidY = Greenfoot.getRandomNumber(getHeight()/5*3);
            int random = Greenfoot.getRandomNumber(40) + 25;
            addObject(asteroid[i],asteroidX,asteroidY);
            asteroid[i].getImage().scale(random, random);
        }
    }
}
