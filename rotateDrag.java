import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Write a description of class rotateDrag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rotateDrag extends dragon
{
    /**
     * Act - do whatever the rotateDrag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    shuriken shuriken;
    boolean cegah;
    
    public void act() 
    {
        delay++;
        if(delay > 50)
        {
            shuriken = new shuriken();
            getWorld().addObject(shuriken, getX(), getY());
            shuriken.setRotation(getRotation());
            shuriken = null;
            delay = 0;
            delayLemparD = true;
        }
        
        if(Player.nyawaHabis == true){
            cegah = true;
        }
        
        if(cegah == false){
            Actor pemain = getWorld().getObjects(Player.class).get(0);
            turnTowards(pemain.getX(), pemain.getY());
        }
        
        if(nyawa >= 10)
        {
            getWorld().removeObject(this);
        }
    }     
}
