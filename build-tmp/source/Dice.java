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
	size(430, 500);
	noLoop();
}


int distY = 50;
int distX = 50;
Die bob;


public void draw()
{
	int sum=0;
	background(150);

	for(int y=10;y<=distY*5+10;y+=distY)
	{
		for(int x=20; x<=distX*7+20; x+=distX)
		{
			bob = new Die(x, y);
			bob.show();
			bob.roll();
			sum = sum + bob.value;
		}
	}

	text("Total: " + sum, 190, 350);

		
}
 
public void mousePressed()
{
	redraw();
}

class Die //models one single dice cube
{
	//variable declarations here
	int myX, myY, value;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		myY=y;
		myX=x;
		value = (int)(Math.random()*6 +1);

	}
	public void roll()
	{
		noStroke();
		if (value == 1){
			fill(0, 180, 225);
			ellipse(myX+20, myY+20, 7, 7);
		}
		if (value == 2){
			fill(0, 255, 128);
			ellipse(myX+10, myY+10, 7, 7);
			ellipse(myX+30, myY+30, 7, 7);
		} 
		if (value == 3){
			fill(217, 255, 0);
			ellipse(myX+10, myY+10, 7, 7);
			ellipse(myX+20, myY+20, 7, 7);
			ellipse(myX+30, myY+30, 7, 7);
		}
		if (value == 4){
			fill(255, 105, 167);
			ellipse(myX+10, myY+10, 7, 7);
			ellipse(myX+30, myY+30, 7, 7);
			ellipse(myX+10, myY+30, 7, 7);
			ellipse(myX+30, myY+10, 7, 7);
		} 
		if (value == 5){
			fill(255, 143, 94);
			ellipse(myX+10, myY+10, 7, 7);
			ellipse(myX+30, myY+30, 7, 7);
			ellipse(myX+20, myY+20, 7, 7);
			ellipse(myX+10, myY+30, 7, 7);
			ellipse(myX+30, myY+10, 7, 7);
		 }
		 if (value == 6){
		 	fill(212, 138, 225);
			ellipse(myX+10, myY+10, 7, 7);
			ellipse(myX+30, myY+30, 7, 7);
			ellipse(myX+10, myY+20, 7, 7);
			ellipse(myX+30, myY+20, 7, 7);
			ellipse(myX+10, myY+30, 7, 7);
			ellipse(myX+30, myY+10, 7, 7);
		}
	}
	public void show()
	{
		//your code here
		fill(255);
		rect(myX,myY,40,40,3);
		
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
