private double fractionLength = 1.2; 
private int biggestCircle = 300; 
private double cAngle = .4;  

public void setup()
{
	size(600,600);
	noLoop();
}

public void draw()
{
	background(0);
	fill(255,0,0,50);
	frac(0,0,2,3*Math.PI/2);
}

public void frac(int x, int y, double len, double angle)
{
	double angle1;

	len = len*fractionLength;
	angle1 = angle+cAngle;
	
	int endX = x+20;//(int)(x*Math.cos(angle1));
	int endY = y+20;//(int)(y*Math.sin(angle1));
	

	ellipse(x,y,(float)len,(float)len);

	if (len<biggestCircle)
	{
		frac(endX,endY,len,angle1);	
	}
}