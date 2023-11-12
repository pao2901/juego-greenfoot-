import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class opening extends World
{

    
    /**
     * Constructor for objects of class opening.
     * 
     */
   static GreenfootSound laguopen = new GreenfootSound("opening.mp3");

    public opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 500, 1);
        laguopen.setVolume(50);
        laguopen.playLoop();
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        tombol tombol = new tombol();
        addObject(tombol,388,402);
        about about = new about();
        addObject(about,34,38);
    }
}
