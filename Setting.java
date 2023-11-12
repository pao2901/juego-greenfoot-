import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Setting here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Setting extends Actor
{
    private static final int acceleration = 2;      // down (gravity)
    private static final int speed = 7;             // running speed (sideways)
    
    private int vSpeed = 0;
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 , kotak.class);
        
        return under != null;
    }
    
    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight - getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
}
