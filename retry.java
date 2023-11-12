import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class retry extends Actor {

    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new notifikasi());
            Stage.level = 1;
            Stage.counter.setValue(0);
            Greenfoot.playSound("klik.wav");
            if (Stage.level == 1) {
                level1.lagulvl1.stop();
            }
            if (Stage.level == 2) {
                level2.lagulvl2.stop();
            }
            if (Stage.level == 3) {
                level3.lagulvl3.stop();
            }
        }
    }
}
