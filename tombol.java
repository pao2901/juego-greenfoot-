import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class tombol extends Actor
{
    /**
     * Act - do whatever the tombol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public tombol()
    {
    }  
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
        
            //getWorld().addObject(new notif(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.setWorld(new notifikasi());
            Stage.level = 1;
            opening.laguopen.stop();
            Greenfoot.playSound("klik.wav");
        }
    }
}
