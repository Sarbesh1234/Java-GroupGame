import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    String x = JOptionPane.showInputDialog("Enter width of World");
    String y = JOptionPane.showInputDialog("Enter height of World"); 
    int wid = Integer.parseInt(x);
    int hei = Integer.parseInt(y);
    public static int width = Integer.parseInt(wid);
    public static int height = Integer.parseInt(hei);
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        this(width, height, 1, false);

    }

    public GameWorld(int wid, int hei, int size){
        super(wid, hei, size); 
    }

    public GameWorld(int wid, int hei, int size, boolean bounded){
        super(wid, hei, size, bounded); 
    }
}
