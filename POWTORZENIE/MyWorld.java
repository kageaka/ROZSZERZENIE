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
        super(1500, 900, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Frog frog = new Frog();
        addObject(frog,727,434);
        Hipopotam hipopotam = new Hipopotam();
        addObject(hipopotam,736,308);
        Hipopotam hipopotam2 = new Hipopotam();
        addObject(hipopotam2,946,448);
        Hipopotam hipopotam3 = new Hipopotam();
        addObject(hipopotam3,748,585);
        Hipopotam hipopotam4 = new Hipopotam();
        addObject(hipopotam4,549,467);
        Kangur kangur = new Kangur();
        addObject(kangur,1169,754);
        Kangur kangur2 = new Kangur();
        addObject(kangur2,1211,212);
        Kangur kangur3 = new Kangur();
        addObject(kangur3,237,217);
        Kangur kangur4 = new Kangur();
        addObject(kangur4,253,704);
        kangur.setLocation(741,724);
        kangur3.setLocation(729,217);
        kangur2.setLocation(1125,437);
        kangur4.setLocation(373,477);
        Kangur kangur5 = new Kangur();
        addObject(kangur5,1149,715);
        Kangur kangur6 = new Kangur();
        addObject(kangur6,1113,197);
        Kangur kangur7 = new Kangur();
        addObject(kangur7,392,211);
        Kangur kangur8 = new Kangur();
        addObject(kangur8,369,773);
        kangur8.setLocation(373,766);
        kangur8.setLocation(378,742);
        frog.setLocation(111,64);
        Hipopotam hipopotam5 = new Hipopotam();
        addObject(hipopotam5,1237,105);
        Hipopotam hipopotam6 = new Hipopotam();
        addObject(hipopotam6,1275,620);
        Hipopotam hipopotam7 = new Hipopotam();
        addObject(hipopotam7,1316,725);
        Hipopotam hipopotam8 = new Hipopotam();
        addObject(hipopotam8,1263,326);
        Hipopotam hipopotam9 = new Hipopotam();
        addObject(hipopotam9,806,68);
        Hipopotam hipopotam10 = new Hipopotam();
        addObject(hipopotam10,458,101);
        Hipopotam hipopotam11 = new Hipopotam();
        addObject(hipopotam11,62,482);
        Hipopotam hipopotam12 = new Hipopotam();
        addObject(hipopotam12,207,347);
        Hipopotam hipopotam13 = new Hipopotam();
        addObject(hipopotam13,591,832);
        Hipopotam hipopotam14 = new Hipopotam();
        addObject(hipopotam14,215,806);
        Hipopotam hipopotam15 = new Hipopotam();
        addObject(hipopotam15,1330,870);
    }
}
