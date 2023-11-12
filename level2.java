
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends Stage
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    
    static GreenfootSound lagulvl2 = new GreenfootSound("level2.mp3");
    
    public level2()
    {
        kecepatan = 1;
        level = 2;
        stage.setValue(level);
        lagulvl2.setVolume(50);
        lagulvl2.playLoop();
        
        prepare();
    }
    
    private void prepare()
    {
        player = new Player(200);
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
        Enemy enemy = new Enemy();
        addObject(enemy,785,154);
        floorNyawa.setLocation(621,140);
        enemy.setLocation(639,37);
        awan awan = new awan();
        addObject(awan,634,76);
    }
}
