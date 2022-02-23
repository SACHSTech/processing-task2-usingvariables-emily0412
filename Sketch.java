import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {

    //chimney
    stroke(170, 64, 105);
    strokeWeight(3);
    fill(168, 81, 110);
    rect(width/((float)80/27), height/((float)80/11), width/20, height/((float)20/3));
    
    //house
    stroke(241, 156, 187);
    strokeWeight(3);
    fill(250, 218, 221);
    rect(width/((float)10/3), height/((float)80/27), width/((float)5/2), height/((float)200/81));

    //roof
    stroke(181, 114, 129);
    strokeWeight(3);
    fill(217, 134, 149);
    triangle(width/((float)80/19), height/((float)80/27), width/20, height/8, width/((float)80/61), height/((float)80/27));

    //window
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(204, 259, 255);
    ellipse(200, 175, 30, 30);

    //door
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(239, 187, 204);
    rect(210, 235, 40, 62);

    //doorknob
    fill(165, 42, 42);
    noStroke();
    ellipse(240, 265, 7, 7);

    //ground colour
    fill(163, 193, 173);
    noStroke();
    rect(0, 294, 400, 294);

    //ground first line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(70, 300, 330, 300);
    
    //ground second line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(100, 330, 300, 330);
  }
  
  // define other methods down here.
}