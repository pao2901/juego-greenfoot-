import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    static GreenfootImage bg;
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,51,44);
        next next = new next();
        addObject(next,780,43);
    }
    static int slide=0;
    public void act()
    {
        if(slide == 1)
        {
            bg = new GreenfootImage("credit2.jpg");
            setBackground(bg);
        }
        
        if(slide == 2)
        {
            bg = new GreenfootImage("credit3.jpg");
            setBackground(bg);
        }
    }
    
    
}
