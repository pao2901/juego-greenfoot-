import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class health extends Actor
{
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int tambahDarah=10; 
    private int point;
    private GreenfootImage bar;
    static boolean nambahNyawa = false;
    
    public health()
    {
        point = 100;
        bar = new GreenfootImage(100, 10);
        bar.setColor(Color.RED);
        bar.fill();
        setImage(bar);
    }
    
    public void act() 
    {
        Actor pemain = getWorld().getObjects(Player.class).get(0);
        setLocation(pemain.getX(), pemain.getY()-40);
        
        if(point <= 1)
        {
            getWorld().addObject(new gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2-60);
            getWorld().addObject(new retry(), getWorld().getWidth()/2-60, getWorld().getHeight()*3/4);
            getWorld().addObject(new back(), getWorld().getWidth()/2+60, getWorld().getHeight()*3/4);
            Player.nyawaHabis = true;
            getWorld().removeObject(this);
        }
        
        if(jebakan.kurangDarah == true && Stage.stop != 0)
        {
            addDarah(-3);
            jebakan.kurangDarah = false;
        }
        
        if(nambahNyawa == true && getDarah() < 100){
           addDarah(tambahDarah);
           nambahNyawa = false;
        }
        
        if(shuriken.kenaShuriken == true){
            addDarah(-10);
            shuriken.kenaShuriken = false;
        }
        
        if(Stage.level == 3)
        {
            tambahDarah = 50;
        }
    }    
    
    public void addDarah(int inputPengurangan)
    {
        point = point + inputPengurangan;
        if(point <= 1)
        {
            point = 1;
        }
        bar = new GreenfootImage(point, 10);
        bar.setColor(Color.RED);
        bar.fill();
        setImage(bar);
    }
    
    public int getDarah()
    {
        return point;
    }
    
}
