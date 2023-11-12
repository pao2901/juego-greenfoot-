import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends Stage
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    
    static GreenfootSound lagulvl3 = new GreenfootSound("level3.mp3");
    
    public level3()
    {
        kecepatan = 2;
        level = 3;
        stage.setValue(level);
        lagulvl3.setVolume(50);
        lagulvl3.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player = new Player();
        addObject(player,280,236);
        
        darah = new health();
        addObject(darah, 280, 196);

        addObject(counter,56,26);

        addObject(jebakan,423,480);
        addObject(kosong,283,286);
        addObject(kosong2,754,410);
        addObject(koin,88,409);
        addObject(floorNyawa,611,94);
        addObject(kosong3,141,161);
        addObject(kosong4,528,244);
        addObject(stage,779,28);
        dragon dragon = new dragon();
        addObject(dragon,725,136);
    }
}
