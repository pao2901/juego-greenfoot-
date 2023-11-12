import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kunai here.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shuriken extends Actor
{
    /**
     * Act - do whatever the kunai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage a = getImage();
    int x = 0;
    
    static boolean kenaShuriken = false;
    
    public void act() 
    {
        a.rotate(15);
        setImage(a);
        if(Stage.stop!=0)
        {
            move(10);
        }
        
        
        if(isTouching(Player.class))
        {
            kenaShuriken = true;
            getWorld().removeObject(this);
        }
        
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
