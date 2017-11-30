import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hipopotam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hipopotam extends Actor
{
    int kierunek = 1 ;
    /**
     * Act - do whatever the Hipopotam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (kierunek);
        if(isAtEdge())kierunek = kierunek * (-1);
    }    
}
