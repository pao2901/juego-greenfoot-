import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class about extends Actor
{
    
    /**
     * Act - do whatever the about wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Credit());
            Greenfoot.playSound("klik.wav");
        }
    }    
}
