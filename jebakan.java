import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jebakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jebakan extends Actor
{
    
    /**
     * Act - do whatever the jebakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static boolean kurangDarah = false;
    
    public void act() 
    {
        if(isTouching(Player.class))
        {
            kurangDarah = true;
        }
    }    
}
