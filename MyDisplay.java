package GuiModule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{

	public void setup() {
		
		size(600, 600);
		background(186, 229, 229);
	}
	
	public void draw() {
		
		//happy face
		fill(255, 239, 120);
		ellipse(950, 500, 450, 350);
		
		//left-eye
		fill(0, 0, 0);
		ellipse(850, 430, 50, 70);
		
		//right-eye
		fill(0, 0, 0);
		ellipse(1040, 430, 50, 70);
		
		//mouth
		noFill();
		arc(950, 550, 75, 75, 0,  PI);
				
	}

}
