import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangur extends Actor
{
    int zycia = 3;
    private void jedzenie ()
    {if (isTouching (Frog.class)) 
        {
            removeTouching (Frog.class);
            zycia --;
        }
    }
        
       
        public void pokazZycia()
    {
        getWorld().showText ("Życia:" +zycia, 100, 60);
    }
    /**
     * Act - do whatever the Kangur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        jedzenie ();
        pokazZycia ();
    }    
}
