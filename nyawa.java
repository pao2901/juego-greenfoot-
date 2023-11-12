import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends Actor
{
    /**
     * Act - do whatever the nyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    GreenfootSound nyawa = new GreenfootSound("health.wav");
    
    public void act() 
    {
        setLocation(getX()-((4+Stage.kecepatan)*Stage.stop), getY());
        
        if(getX() <= 3)
        {
            getWorld().removeObject(this);
        }
        else if (isTouching(Player.class))
        {
            nyawa.setVolume(100);
            nyawa.play();
            getWorld().removeObject(this);
            health.nambahNyawa = true;
        }
        
    }    
}
