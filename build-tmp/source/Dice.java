import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(500, 500);
	noLoop();
}


int distY = 40;
int distX = 40;
Die bob;


public void draw()
{
	background(150);

	for(int y=10;y<=distY*5+10;y+=distY)
	{
		for(int x=20; x<=distX*7+20; x+=distX)
		{
			bob = new Die(x, y);
			bob.show();
		}
	}

		
}

public void mousePressed()
{
	redraw();
}

class Die //models one single dice cube
{
	//variable declarations here
	int toss, myX, myY;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		myY=y;
		myX=x;


	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{
		//your code here
		rect(myX,myY,30,30,3);
	}
}




  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
