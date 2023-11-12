import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TampilkanScore extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage tampil;
    Color transparan = new Color(0,0,0,0);
    
    public TampilkanScore()
    {
        tampil = new GreenfootImage("SCORE ANDA : "+Stage.counter.getValue(), 45, Color.WHITE, transparan);
        setImage(tampil);
    }  
    
    public void act() 
    {
        
    }    
}
