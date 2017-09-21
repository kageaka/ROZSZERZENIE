import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ludzik2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ludzik2 extends Actor
{
    int kierunek = -1 ;
    /**
     * Act - do whatever the ludzik2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action move (kierunek);
        move (kierunek);
        if(isAtEdge())kierunek = kierunek * (-1);
    }    
}
