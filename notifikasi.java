import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class notifikasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class notifikasi extends World
{


    /**
     * Constructor for objects of class notifikasi.
     * 
     */
    public notifikasi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 500, 1); 
        Stage stage = new Stage();
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            if(Stage.level == 1)
            {
                level2.lagulvl2.stop();
                level3.lagulvl3.stop();
                Greenfoot.setWorld(new level1());
            }
            else if(Stage.level == 2){
                level1.lagulvl1.stop();
                Greenfoot.setWorld(new level2());
            }
            else if(Stage.level == 3){
                level2.lagulvl2.stop();
                Greenfoot.setWorld(new level3());
            }
        }
        
        
    }  
}
