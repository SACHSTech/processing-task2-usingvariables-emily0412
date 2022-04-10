import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(700, 500);
  }

  public void setup() {
    background(176,224,230);
  }

  public void draw() {

    // chimney
    stroke(170, 64, 105);
    strokeWeight(3);
    fill(168, 81, 110);
    rect(width/((float)80/27), height/((float)80/11), width/20, height/((float)20/3));
    
    // house
    stroke(241, 156, 187);
    strokeWeight(3);
    fill(250, 218, 221);
    rect(width/((float)10/3), height/((float)80/27), width/((float)5/2), height/((float)200/81));

    // roof
    stroke(181, 114, 129);
    strokeWeight(3);
    fill(217, 134, 149);
    triangle(width/((float)80/19), height/((float)80/27), width/2, height/8, width/((float)80/61), height/((float)80/27));

    // window
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(204, 259, 255);
    ellipse(width/2, height/((float)16/7), width/((float)40/3), height/((float)40/3));

    // door
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(239, 187, 204);
    rect(width/((float)40/21), height/((float)80/47), width/10, height/((float)200/31));

    // doorknob
    fill(165, 42, 42);
    noStroke();
    ellipse(width/((float)5/3), height/((float)80/53), width/((float)400/7), height/((float)400/7));

    // ground colour
    fill(163, 193, 173);
    noStroke();
    rect(width*0, height/((float)80/59), width, height/((float)80/59));

    // ground first line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(width/((float)40/7), height/((float)4/3), width/((float)40/33), height/((float)4/3));
    
    // ground second line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(width/4, height/((float)40/33), width/((float)4/3), height/((float)40/33));
  }
  
}