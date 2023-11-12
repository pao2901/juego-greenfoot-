import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Write a description of class naga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class naga extends dragon
{
    /**
     * Act - do whatever the naga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(nyawa >= 10)
        {
            getWorld().removeObject(this);
        }
    }    
}
