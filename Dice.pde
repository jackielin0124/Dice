void setup()
{
	size(500, 500);
	noLoop();
}


int distY = 40;
int distX = 40;
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
	int toss, myX, myY;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		myY=y;
		myX=x;


	}
	void roll()
	{
		//your code here
	}
	void show()
	{
		//your code here
		rect(myX,myY,30,30,3);
		
	}
}




