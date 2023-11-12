import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Write a description of class floorNyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class floorNyawa extends kotak
{
    /**
     * Act - do whatever the floorNyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;
    int turn = 5;
    public void act() 
    {
        melaju();
        resetLocation();
        if(Stage.level == 3)
        {
            turn = 2;
        }
        if(isAtEdge())
        {
            delay = delay + 1;
            if(delay>=turn)
            {
                getWorld().addObject(new nyawa(), getX(), getY()-40);
                delay = 0;
            }
        }
    }    
}
