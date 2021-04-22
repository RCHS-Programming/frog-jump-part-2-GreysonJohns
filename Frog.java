import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    public boolean isUpPress;
    public boolean isDownPress;
    public boolean isRightPress;
    public boolean isLeftPress;
    
    public Frog()
    {
        isUpPress = false;
        isDownPress = false;
        isRightPress = false;
        isLeftPress = false;
    }
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyJump();
        checkCollision();
    }    
    
    public void keyJump()
    {
        //Check for the up key
        if( isUpPress == false && Greenfoot.isKeyDown("up") && getY() > 60)
        {
            setLocation( getX() , getY() - 60);
            isUpPress = true;
        }
        
        if( isUpPress && !Greenfoot.isKeyDown("up"))
        {
            isUpPress = false;
        }
        
        //Check for the down key
        if(isDownPress == false && Greenfoot.isKeyDown("down") && getY() < 540)
        {
            setLocation(getX(), getY() + 60);
            isDownPress = true;
        }
        
        if(isDownPress && !Greenfoot.isKeyDown("down"))
        {
            isDownPress=false;
        }
        
        
        
        //Check for the right key
        if(isRightPress == false && Greenfoot.isKeyDown("right") && getX() < 740)
        {
            setLocation(getX() + 60, getY());
            isRightPress = true;
        }
        
        if(isRightPress && !Greenfoot.isKeyDown("right"))
        {
            isRightPress=false;
        }
        
        
        
        //Check for the left key
        if(isLeftPress == false && Greenfoot.isKeyDown("left") && getX() > 60)
        {
            setLocation(getX() - 60, getY());
            isLeftPress = true;
        }
        
        if(isLeftPress && !Greenfoot.isKeyDown("left"))
        {
            isLeftPress=false;
        }
        
        
        
    }
    
    public void checkCollision()
    {
        if(isTouching(Car.class) || isTouching(Truck.class))
        {
            setLocation(370, 510);
        }
    }
}
