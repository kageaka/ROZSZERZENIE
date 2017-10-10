import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Pizza extends Actor
{
   
    public void act() 
    {
 
        turn (90);
        move (1);
        turn (-90);
        
        int y = getY();
        int wysokoscSwiata = getWorld().getHeight();
        if (y >= wysokoscSwiata - 1) getWorld().removeObject (this);
        // Add your action code here.
    }    
    
  
}
