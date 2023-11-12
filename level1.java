import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends Stage
{


    /**
     * Constructor for objects of class level1.
     * 
     */
    
    static GreenfootSound lagulvl1 = new GreenfootSound("level1.mp3");
    
    public level1()
    {
        kecepatan = 1;
        level = 1;
        stage.setValue(level);
        lagulvl1.setVolume(75);
        lagulvl1.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        player = new Player(100);
        addObject(player,280,236);
        
        darah = new health();
        addObject(darah, 280, 196);

        addObject(counter,56,26);

        counter.setValue(0);

        addObject(jebakan,423,480);

        addObject(kosong,283,286);

        addObject(kosong2,754,410);

        addObject(koin,88,409);

        addObject(floorNyawa,611,94);
        addObject(kosong3,141,161);
        addObject(kosong4,528,244);

        addObject(stage,779,28);
        
    }
}
