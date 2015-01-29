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

public class OriginalFractal extends PApplet {

private double fractionLength = 1.2f; 
private int biggestCircle = 300; 
private double cAngle = .4f;  

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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
