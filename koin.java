import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koin extends kotak
{
    /**
     * Act - do whatever the koin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    coin coin = new coin();
    public void act() 
    {
        melaju();
        resetLocation();

        if(getX() == getWorld().getWidth()-1)
        {
            coin = new coin();
            getWorld().addObject(coin, getX(), getY()-40);
        }
        
        
        if(isTouching(floorNyawa.class))
        {
            setLocation(getWorld().getWidth()-1, generateRandom());
            coin.setLocation(getX(), getY()-40);
        }
        
    }    
}
