import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound koin = new GreenfootSound("coin.wav");
    
    public void act() 
    {
        setLocation(getX()-((4+Stage.kecepatan)*Stage.stop), getY());
        
        if(getX()<=1)
        {
            getWorld().removeObject(this);
        }
        else if (isTouching(Player.class))
        {
            Stage.counter.add(10);
            koin.setVolume(80);
            koin.play();
            getWorld().removeObject(this);
        }
    }    
}
