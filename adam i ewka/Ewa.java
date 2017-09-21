import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ewa extends Actor
{
    int koszyczek = 5;

    public void klawisze ()
    {
        if (Greenfoot.isKeyDown ("d")) move (1);
        if (Greenfoot.isKeyDown ("a")) move (-1);
        if (Greenfoot.isKeyDown ("w"))
        {
            turn (-90);
            move (1);
            turn (90);
        }
        if (Greenfoot.isKeyDown ("s"))
        {
            turn (-90);
            move (-1);
            turn (90);
        }

    }

    public void stawiaj ()
    {
        if (Greenfoot.isKeyDown (" "))
            if (!isTouching (Apple.class))
            {
                World swiat;
                swiat = getWorld ();
                int x,y;
                x = getX();
                y = getY ();
                if (koszyczek > 0) 
                    swiat.addObject ( new Apple (), x, y );
                koszyczek--;

            }
    }
public void pobierzJablka ()
{
if (isTouching (Drzewko.class)) koszyczek = 5;
}
    public void act() 
    {
        klawisze ();
        stawiaj ();
        pobierzJablka ();
        // Add your action code here.
    }    
}
