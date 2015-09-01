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

public class OriginalDesign extends PApplet {

public void setup()
{
	
	size(500,500);
	

}

public void board()
{ 
	stroke(0,0,0);	
	line(500/3,75,500/3,425); 
	line(500/1.5f,75,500/1.5f,425);
	line(75,500/3,425,500/3);
	line(75,500/1.5f,425,500/1.5f);
}

public void XO() 
{	
	fill(255,0,0);
    int playNum = 1 ;
    if(mousePressed)
    {  
    textSize(40);
    if (playNum == 1)
    	{
    text("X", mouseX,mouseY);       
    
    
  		}
    }
    if(keyPressed) {
        text("O", mouseX+25,mouseY);
       
   }
    
        

}

public void draw()
{
	
	setup();
	background(255,255,255);
	XO();
	board();
	 
	
	
}



    
   


	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
