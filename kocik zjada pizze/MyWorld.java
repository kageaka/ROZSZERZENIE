import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(1500 ,800, 1); 
        prepare();
    }

    
    private void prepare()
    {
        Kocik kocik = new Kocik();
        addObject(kocik,739,759);
        kocik.setLocation(730,714);
    }
    
    
    public void act ()
    {
        int los = Greenfoot.getRandomNumber (100);
        if (los <= 1)
        {
      int x =  Greenfoot.getRandomNumber (getWidth ());
      Pizza pizza = new Pizza ();
      addObject (pizza, x, 0);
    }
}
}




