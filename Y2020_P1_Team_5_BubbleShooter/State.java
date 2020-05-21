import greenfoot.*;
public abstract class State  {
    private GameWorld x;
    
    public State(GameWorld world) {
        x = world;
    }
    
    public GameWorld getWorld() {
        return x;
    }
    
    public abstract void onSet();
    
    public void onRemove() {
        
        getWorld().removeObjects(getWorld().getObjects(Actor.class));
    }
    
    public void onAct() {
        
    }
}
