import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500,800,1); 
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
    public void act ()
    {
    // czynność wykonywana w kółko
    if (Greenfoot.isKeyDown ("k"))
    {
    // 1.wylosuj polozenie weza
    int szerokosc = this.getWidth ();
    int wysokosc = this.getHeight ();

    // 2.umiesc weza na swiecie
    //2.1 zapytaj ile wezy
    String odp = Greenfoot.ask ("Ile węży dodać jaśnie Panie?");
    int ile = Integer.parseInt (odp);
    //2.2 dodaj weza w podanej liczbie
    for (int i = 0;  i < ile ;i++)
    {
    int x = Greenfoot.getRandomNumber ( szerokosc );
    int y = Greenfoot.getRandomNumber ( wysokosc );
    Wonsz wonsz = new Wonsz ();
    addObject (wonsz, x ,y);
    while (wonsz.dotykaAdama () )
    {
    x = Greenfoot.getRandomNumber ( szerokosc );
    y = Greenfoot.getRandomNumber ( wysokosc );
    wonsz.setLocation (x,y);
    }
      while (wonsz.dotykaEwe() )
    {
    x = Greenfoot.getRandomNumber ( szerokosc );
    y = Greenfoot.getRandomNumber ( wysokosc );
    wonsz.setLocation (x,y);
    }
    
    // sprawdz czy nie dotyka ludzikow
    // jesli dotyka to przenies w inne miejsce
    //jesli nadal dotyka, dalej przenosc
    
    
    
    }
   
}
    }
}
