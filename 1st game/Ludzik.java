import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ludzik extends Actor
{
    private void klawisze ()
    {if(Greenfoot.isKeyDown ("right")) move (1);
        if(Greenfoot.isKeyDown ("left")) move (-1);
        if(Greenfoot.isKeyDown ("up")) 
        {
            turn (-90);
            move (1);
            turn (90);
        }
        if(Greenfoot.isKeyDown ("down")) 
        {
            turn (-90);
            move (-1);
            turn (90);
        }}
        private void zjadanie ()
        {
        if (isTouching (ludzik2.class))
        removeTouching (ludzik2.class);
        }

    public void act() 
    {
        klawisze ();
        zjadanie ();

    }    
}
