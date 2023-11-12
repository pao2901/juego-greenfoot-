import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Setting
{
    
    private static final int jumpStrength = 24;
    boolean jumping;
    boolean isKeyPressed= false;
    boolean facingRight = true;
    int framejump;
    int framerun;
    int frameattack;
    int poin;
    int delay;
    int delayPause = 1;
    boolean checkJatuh = false;
    GreenfootSound lompat = new GreenfootSound("jumpBaru.wav");
    static boolean nyawaHabis = false;
    //constractor
    public Player()
    {
        
    }
    
    public Player(int maxPoint)
    {
        poin = maxPoint;
    }
    
    public void act() 
    {
        if(Stage.stop != 0)
        {
            checkKey();
            checkFall();
        }
        
        
        if(Stage.counter.getValue() == poin && Stage.level != 3)
        {
            Greenfoot.setWorld(new notifikasi());
            Stage.level++;
        }
        
        
        
        if(getY() > 456 && nyawaHabis == false)
        {
            setLocation(getX(), 455);
        }
        
        if(nyawaHabis == true){
            getWorld().removeObject(this);
            nyawaHabis = false;
        }
    }
    
    public void checkKey(){
        isKeyPressed = false;
        if(Greenfoot.isKeyDown("f") && Stage.level == 3)
        {
            delay++;
            if(delay > 10)
            {
                Greenfoot.playSound("throwbaru.wav");
                getWorld().addObject(new kunai(), getX()+10, getY());
                delay =0;
            }
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            facingRight = true;
            runright();
            setLocation(getX()+4,getY());
            isKeyPressed = true;
        }else if (Greenfoot.isKeyDown("left"))
        {
            facingRight = false;
            runleft();
            setLocation(getX()-8,getY());
            isKeyPressed = true;
        }
        
        
        
        if (Greenfoot.isKeyDown("space"))
        {
            isKeyPressed = true;
            if (onGround() || getY() >= getWorld().getHeight()-45)
            {
                jump();
                lompat.setVolume(75);
                lompat.play();
            }
                
        }
        else if(!(isKeyPressed)){
            idle();
            setLocation(getX()-(4+Stage.kecepatan), getY());   
        }
       
    }
    
    public void jumpr(){
        setImage("Player/Jumpr/jump(1).png");
    }
    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    
    private void checkFall()
    {
        if (onGround() && isTouching(kotak.class)){
            setVSpeed(1);
        }
        else{
            fall();
        }
    }
    
    public void idle(){
        if(facingRight){
            setImage("Player/Idle/idler.png");
        }else{
            setImage("Player/Idle/idlel.png");
        }
    }
    
     public void runright(){
        framerun++;
        if(framerun == 2)
        {
            setImage("Player/Run/run1.png");
        }
        else if(framerun == 4)
        {
            setImage("Player/Run/run2.png");
        }
        else if(framerun == 6)
        {
            setImage("Player/Run/run3.png");
        }
        else if (framerun == 8)
        {
            setImage("Player/Run/run4.png");
        }
        else if (framerun == 10)
        {
            setImage("Player/Run/run5.png");
        }else if (framerun == 12)
        {
            setImage("Player/Run/run6.png");
        }else if (framerun == 14)
        {
            setImage("Player/Run/run7.png");
        }else if (framerun == 16)
        {
            setImage("Player/Run/run8.png");
        }
        else if (framerun == 18)
        {
            setImage("Player/Run/run9.png");
        }else if (framerun == 20)
        {
            setImage("Player/Run/run10.png");
            framerun = 0;
        }
    }
    
     public void runleft(){
        framerun++;
        if(framerun == 2)
        {
            setImage("Player/Runl/run1.png");
        }
        else if(framerun == 4)
        {
            setImage("Player/Runl/run2.png");
        }
        else if(framerun == 6)
        {
            setImage("Player/Runl/run3.png");
        }
        else if (framerun == 8)
        {
            setImage("Player/Runl/run4.png");
        }
        else if (framerun == 10)
        {
            setImage("Player/Runl/run5.png");
        }else if (framerun == 12)
        {
            setImage("Player/Runl/run6.png");
        }else if (framerun == 14)
        {
            setImage("Player/Runl/run7.png");
        }else if (framerun == 16)
        {
            setImage("Player/Runl/run8.png");
        }
        else if (framerun == 18)
        {
            setImage("Player/Runl/run9.png");
        }else if (framerun == 20)
        {
            setImage("Player/Runl/run10.png");
            framerun = 0;
        }
    }
}
