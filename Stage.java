import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{


    /**
     * Constructor for objects of class background1.
     * 
     */
    
    static boolean statusMati = false;
    
    Player player = null;
    static health darah = null;
    
    static Counter counter = new Counter("Poin : ");
    jebakan jebakan = new jebakan();
    kotak kosong = new kosong();
    kotak kosong2 = new kosong();
    kotak kosong3 = new kosong();
    kotak kosong4 = new kosong();
    kotak koin = new koin();
    kotak floorNyawa = new floorNyawa();
    Counter stage = new Counter("Stage : ");
    
    static int level = 1;
    static int kecepatan=0;
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 500, 1); 
    }
    static int stop = 1;
    private int delay = 10;
    pause pause;
    public void act()
    {
        delay++;
        if(delay >= 10)
        {
            if(Greenfoot.isKeyDown("p") && stop == 1)
            {
            pause = new pause();
            addObject(pause, getWidth()/2, getHeight()/2);
            stop = 0;
            }
            else if(Greenfoot.isKeyDown("p") && stop == 0)
            {
                removeObject(pause);
                stop = 1;
            }
            delay = 0;
        }
        
    }
    
    public static World thisLevel()
    {
        if(level == 1)
        {
            return new level1();
        }
        if(level == 2){
            return new level2();
        }
        if(level == 3){
            
            return new level3();
        }
            
        return new ending();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

}
