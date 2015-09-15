void setup()
{
	size(500, 500);
	noLoop();
}


int distY = 50;
int distX = 50;
Die bob;


void draw()
{
	background(150);

	for(int y=10;y<=distY*5+10;y+=distY)
	{
		for(int x=20; x<=distX*7+20; x+=distX)
		{
			bob = new Die(x, y);
			bob.show();
			bob.roll();
		}
	}

		
}
 
void mousePressed()
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
	void roll()
	{
		if (value == 1){
			ellipse(myX+20, myY+20, 5, 5);
		}
		if (value == 2){
			ellipse(myX+10, myY+10, 5, 5);
			ellipse(myX+30, myY+30, 5, 5);
		} 
		if (value == 3){
			ellipse(myX+10, myY+10, 5, 5);
			ellipse(myX+20, myY+20, 5, 5);
			ellipse(myX+30, myY+30, 5, 5);
		}
		if (value == 4){
			ellipse(myX+10, myY+10, 5, 5);
			ellipse(myX+30, myY+30, 5, 5);
			ellipse(myX+10, myY+30, 5, 5);
			ellipse(myX+30, myY+10, 5, 5);
		} 
		if (value == 5){
			ellipse(myX+10, myY+10, 5, 5);
			ellipse(myX+30, myY+30, 5, 5);
			ellipse(myX+20, myY+20, 5, 5);
			ellipse(myX+10, myY+30, 5, 5);
			ellipse(myX+30, myY+10, 5, 5);
		 }
		 if (value == 6){
			ellipse(myX+10, myY+10, 5, 5);
			ellipse(myX+30, myY+30, 5, 5);
			ellipse(myX+10, myY+20, 5, 5);
			ellipse(myX+30, myY+20, 5, 5);
			ellipse(myX+10, myY+30, 5, 5);
			ellipse(myX+30, myY+10, 5, 5);
		}
	}
	void show()
	{
		//your code here
		rect(myX,myY,40,40,3);
		
	}
}




