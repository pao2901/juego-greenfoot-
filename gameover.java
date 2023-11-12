import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends Actor
{
    /**
     * Act - do whatever the gameover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound gameover= new GreenfootSound("gameover.mp3");
  
    
    public gameover(){
        gameover.setVolume(85);
        gameover.play();
    }
    
    public void act() 
    {
        
    }    
}
