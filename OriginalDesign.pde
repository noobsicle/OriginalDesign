void setup()
{
	
	size(500,500);
	

}

void board()
{ 
	stroke(0,0,0);	
	line(500/3,75,500/3,425); 
	line(500/1.5,75,500/1.5,425);
	line(75,500/3,425,500/3);
	line(75,500/1.5,425,500/1.5);
}

void XO() 
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

void draw()
{
	
	setup();
	background(255,255,255);
	XO();
	board();
	 
	
	
}



    
   


	