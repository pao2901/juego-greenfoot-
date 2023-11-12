import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dragon extends Actor
{
    /**
     * Act - do whatever the dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean limit=false;
    static int nyawa;
    int framethrow;
    static boolean delayLemparD;
    
    public dragon()
    {
        nyawa = 0;
    }
    
    public void act() 
    {
        if(limit == false)
        {
            
            getWorld().addObject(new rotateDrag(), getX(), getY());
            getWorld().addObject(new naga(), getX()+20, getY()+130);
            limit = true;
        }
        
        if(isTouching(kunai.class))
        {
            nyawa++;
            removeTouching(kunai.class);
        }
        
        if(nyawa >= 10)
        {
            Greenfoot.setWorld(new ending());
            getWorld().removeObject(this);
        }
        
        if(delayLemparD == true && Stage.stop!=0){
            lempar();
        }
    }
    
    public void lempar(){
        framethrow++;
        if(framethrow == 2)
        {
            setImage("musuh/throw(1).png");
        }
        else if(framethrow == 4)
        {
            setImage("musuh/throw(2).png");
        }
        else if(framethrow == 6)
        {
            setImage("musuh/throw(3).png");
        }
        else if (framethrow == 8)
        {
            setImage("musuh/throw(4).png");
        }
        else if (framethrow == 10)
        {
            setImage("musuh/throw(5).png");
        }else if (framethrow == 12)
        {
            setImage("musuh/throw(6).png");
        }else if (framethrow == 14)
        {
            setImage("musuh/throw(7).png");
        }else if (framethrow == 16)
        {
            setImage("musuh/throw(8).png");
        }
        else if (framethrow == 18)
        {
            setImage("musuh/throw(9).png");
        }else if (framethrow == 20)
        {
            setImage("musuh/throw(10).png");
            framethrow = 0;
            delayLemparD = false;
        }
    }
}
