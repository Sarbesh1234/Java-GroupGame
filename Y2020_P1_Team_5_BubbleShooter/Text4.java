import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text4 extends Actor
{
    private String text;
    private int font;
    private Color foreground;
    private Color background;
    private Color outline;
    private String text2;
    
    public Text4() {
        text = "Use WASD to move";
        font = 45;
        foreground = Color.RED;
        background = Color.ORANGE;
        //outline = Color.RED;
        updateImage();
    }
 
    public Text4(String s) {
        text = s;
        font = 12;
        foreground = Color.BLUE;
        background = Color.GREEN;
        outline = Color.RED;
        
        updateImage();
        
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text2) {
        text2 = text;
        updateImage();
    }
    
    public int getSize() {
        return font;
    }
    
    public void setSize(int size) {
        size = font;
        updateImage();
    }
    
    public Color getForeground() {
        return foreground;
    }
    
    public void setForeground(Color f) {
        f = foreground;
        updateImage();
    }
    
    public Color getBackground() {
        return background;
    }
    
    public void setBackground(Color b) {
        b = background;
        updateImage();
    }
    
    public Color getOutline() {
        return outline;
    }
    
    public void setOutline(Color o) {
        o = outline;
        updateImage();
    }
    
    public void updateImage() {
        GreenfootImage g = new GreenfootImage(text,  font,  foreground, background,  outline);
        setImage(g);
    }   
}
