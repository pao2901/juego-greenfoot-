import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new opening());
            Greenfoot.playSound("klik.wav");
            Credit.slide = 0;
        }    
        if(Stage.level == 1)
        {
            level1.lagulvl1.stop();
        }
        if(Stage.level == 2){
            level2.lagulvl2.stop();
        }
        if(Stage.level == 3){
            level3.lagulvl3.stop();
        }
        if(Stage.level == 3){
            level3.lagulvl3.stop();
        }
        
    }    
}
