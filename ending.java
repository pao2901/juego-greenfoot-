import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ending here.
 * 
 * @author (your name) 
 * 
 * @version (a version number or a date)
 */
public class ending extends World
{

    /**
     * Constructor for objects of class ending.
     * 
     */
    public ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    GreenfootSound menang = new GreenfootSound("WinSound.mp3");
    
    private void prepare()
    {
        level3.lagulvl3.stop();
        menang.setVolume(75);
        menang.play();
        TampilkanScore tampilkanScore = new TampilkanScore();
        addObject(tampilkanScore,413,335);
        back back = new back();
        addObject(back,421,418);
        
    }
}
