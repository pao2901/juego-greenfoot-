import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class check here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class check extends Actor
{
    /**
     * Act - do whatever the check wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bar;
    public check()
    {
        
        bar = new GreenfootImage(200, 250);
        bar.setColor(Color.RED);
        bar.fill();
        setImage(bar);
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
