import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Adam adam = new Adam();
        addObject(adam,380,352);
        Ewa ewa = new Ewa();
        addObject(ewa,1155,324);
        Drzewko drzewko = new Drzewko();
        addObject(drzewko,746,346);
        Haziel haziel = new Haziel();
        addObject(haziel,128,90);
    }
}
