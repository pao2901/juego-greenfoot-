import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class kotak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kotak extends Actor
{
    /**
     * Act - do whatever the kotak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int makan;
    public int generateRandom(){
        int randomNbr = Greenfoot.getRandomNumber(getWorld().getHeight());
            
            if(randomNbr < 170)
            {
                randomNbr = randomNbr + 170;
            }
            
            if(randomNbr > 375)
            {
                randomNbr = randomNbr - 75;
            }
            
        return randomNbr;
    }
    
    public void melaju()
    {
        setLocation(getX()-((4+Stage.kecepatan)*Stage.stop), getY());
    }
    
    public void resetLocation()
    {
        if(isAtEdge())
        {
            setLocation(getWorld().getWidth()-1, generateRandom());
        }
    }
}
