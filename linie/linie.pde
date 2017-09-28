int x, y;
int rozmiar;

void setup()
{
  size (1280, 960);
  x = 0;
  y = 0;
  rozmiar = 40;
  frameRate (144);
}




void draw ()
{
  int los = (int)random(0, 101); 
  stroke (random (256), random (256), random (256));
  strokeWeight (15);
  if (los >=50)  line(x, y, rozmiar+x, rozmiar+y);
  else line ( rozmiar+x, y, x, rozmiar+y);
  x = x+rozmiar;
  if (x >= width ) 
  {
    x = 0;
    y =y + rozmiar;
  }
  if (y >= height )
  {
    x = 0;
    y = 0;
    rozmiar = (int)random(4, 60);
    background (random (256), random (256), random (256));
  }
}