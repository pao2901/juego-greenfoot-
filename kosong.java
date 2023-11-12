import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class kosong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kosong extends kotak
{
    /**
     * Act - do whatever the kosong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        melaju();
        resetLocation();
        
        
        if(isTouching (koin.class) || isTouching (floorNyawa.class) || isTouching(kosong.class)){
            setLocation(getX(), generateRandom());
        }
        
        
    }    
}
