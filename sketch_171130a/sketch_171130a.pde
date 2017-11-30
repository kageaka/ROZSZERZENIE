int kolorTla = (#FFFFFF) ;
int rozmiarKola = 10;
int rozmiarKwadratu = 5;

Bloczek b1;
Bloczek b2;

void setup ()
{size(800,600);
b1 = new Bloczek ();
b2 = new Bloczek ();
}

void draw ()
{
  background(kolorTla);
  fill (#FFED90);
stroke (#ED130C);
strokeWeight (3);
ellipse ( 50 , 80 , rozmiarKola , rozmiarKwadratu );
 fill (#FFFFFF);
stroke (#03F700);
strokeWeight (1);
rect (mouseX, mouseY, rozmiarKola ,rozmiarKwadratu);
b1.draw();
b2.draw();
b1.down();
b2.down();
}

void keyPressed ()
{
if (key == 'k')
{
kolorTla = (int) random (0xFFFFFF);

}
if (key == 'r')
{
rozmiarKola++;
rozmiarKwadratu++;

}
if (key == 'q')
{
rozmiarKola--;
rozmiarKwadratu--;

}

}