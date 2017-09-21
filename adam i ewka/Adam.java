import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Adam extends Actor
{
    int koszyczek = 0;
    public void zjadanie ()
    {
        if (isTouching (Apple.class))
            if (koszyczek < 5)
            {
                removeTouching (Apple.class);
                koszyczek++;
            }
    }

    public void kupa ()
    {
        if (isTouching (Haziel.class)) koszyczek = 0;
    }

    public void klawisze ()
    {
        if (Greenfoot.isKeyDown ("right")) move (1);
        if (Greenfoot.isKeyDown ("left")) move (-1);
        if (Greenfoot.isKeyDown ("up"))
        {
            turn (-90);
            move (1);
            turn (90);
        }
        if (Greenfoot.isKeyDown ("down"))
        {
            turn (-90);
            move (-1);
            turn (90);
        }

    }

    public void act() 
    {
        kupa ();
        klawisze ();
        zjadanie ();
        // Add your action code here.
    }    
}
