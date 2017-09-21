import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ludzik ludzik = new Ludzik();
        addObject(ludzik,93,70);
        Ludzik ludzik2 = new Ludzik();
        addObject(ludzik2,92,330);
        Ludzik ludzik3 = new Ludzik();
        addObject(ludzik3,295,190);
        removeObject(ludzik3);
        ludzik2.setLocation(135,366);
        ludzik.setLocation(139,136);
        ludzik2.setLocation(155,530);
        removeObject(ludzik);
        ludzik2 ludzik22 = new ludzik2();
        addObject(ludzik22,856,107);
        ludzik2.setLocation(170,547);
    }
}
