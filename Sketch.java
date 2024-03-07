import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
Random myRandom = new Random();

//colour parameters

int intColourScalarOne = myRandom.nextInt(300);
int intColourScalarTwo = myRandom.nextInt(300);
int intColourScalarThree = myRandom.nextInt(300);
int intColourScalarFour = myRandom.nextInt(300);
int intColourScalarFive = myRandom.nextInt(300);
int intColourScalarSix = myRandom.nextInt(300);
int intColourScalarSeven = myRandom.nextInt(300);
int intColourScalarEight = myRandom.nextInt(300);
int intColourScalarNine = myRandom.nextInt(300);

//blood parameters

float floatBloodWidthX1 = myRandom.nextInt((30-1)+1);
float floatBloodWidthY1 = myRandom.nextInt((30-1)+1);
float floatBloodWidthX2 = myRandom.nextInt((30-1)+1);
float floatBloodWidthY2 = myRandom.nextInt((30-1)+1);
float floatBloodWidthX3 = myRandom.nextInt((30-1)+1);
float floatBloodWidthY3 = myRandom.nextInt((30-1)+1);
float floatBloodPositionX1 = myRandom.nextInt(800);
float floatBloodPositionY1 = myRandom.nextInt(600);
float floatBloodPositionX2 = myRandom.nextInt(800);
float floatBloodPositionY2 = myRandom.nextInt(600);
float floatBloodPositionX3 = myRandom.nextInt(800);
float floatBloodPositionY3 = myRandom.nextInt(600);
float floatBloodPositionX4 = myRandom.nextInt(800);
float floatBloodPositionY4 = myRandom.nextInt(600);
float floatBloodPositionX5 = myRandom.nextInt(800);
float floatBloodPositionY5 = myRandom.nextInt(600);
float floatBloodPositionX6 = myRandom.nextInt(800);
float floatBloodPositionY6 = myRandom.nextInt(600);
float floatBloodPositionX7 = myRandom.nextInt(800);
float floatBloodPositionY7 = myRandom.nextInt(600);
float floatBloodPositionX8 = myRandom.nextInt(800);
float floatBloodPositionY8 = myRandom.nextInt(600);
float floatBloodPositionX9 = myRandom.nextInt(800);
float floatBloodPositionY9 = myRandom.nextInt(600);
float floatBloodPositionX10 = myRandom.nextInt(800);
float floatBloodPositionY10 = myRandom.nextInt(600);
float floatBloodPositionX11 = myRandom.nextInt(800);
float floatBloodPositionY11 = myRandom.nextInt(600);
float floatBloodPositionX12 = myRandom.nextInt(800);
float floatBloodPositionY12 = myRandom.nextInt(600);
float floatBloodPositionX13 = myRandom.nextInt(800);
float floatBloodPositionY13 = myRandom.nextInt(600);
float floatBloodPositionX14 = myRandom.nextInt(800);
float floatBloodPositionY14 = myRandom.nextInt(600);
float floatBloodPositionX15 = myRandom.nextInt(800);
float floatBloodPositionY15 = myRandom.nextInt(600);
float floatBloodPositionX16 = myRandom.nextInt(800);
float floatBloodPositionY16 = myRandom.nextInt(600);
float floatBloodPositionX17 = myRandom.nextInt(800);
float floatBloodPositionY17 = myRandom.nextInt(600);
float floatBloodPositionX18 = myRandom.nextInt(800);
float floatBloodPositionY18 = myRandom.nextInt(600);
float floatBloodPositionX19 = myRandom.nextInt(800);
float floatBloodPositionY19 = myRandom.nextInt(600);
float floatBloodPositionX20 = myRandom.nextInt(800);
float floatBloodPositionY20 = myRandom.nextInt(600);

//curve parameters

float floatCurveVertexX1 = random(200, 700);
float floatCurveVertexY1 = random(200, 600);
float floatCurveVertexX2 = random(400, 800);
float floatCurveVertexY2 = random(400, 600);

//eclipse parameters

float floatSun = random(300, 800);
float floatEclipsePlanetX = random(0, 150) + floatSun;

  public void settings() {
    size(800, 600);
  }

  public void setup() {
    background(intColourScalarOne,intColourScalarTwo,intColourScalarThree);   

    int intHour = hour();
    int intMinute = minute();

    //print time

    fill(0);
    textSize(25);
    text(intHour + " Hrs", 200, 50);
    text(intMinute + " Mins", 200, 75);
  }
  
  public void draw() {
    
    //draws ground

    fill(intColourScalarFour, intColourScalarFive, intColourScalarSix);
    rect(0,400,1000,300);

    //randomly generates blood splatters

     fill(255,0,0);
     ellipse(floatBloodPositionX1, floatBloodPositionY1, 10, 10);
     ellipse(floatBloodPositionX2, floatBloodPositionY2, 10, 10);
     ellipse(floatBloodPositionX3, floatBloodPositionY3, 10, 10);
     ellipse(floatBloodPositionX4, floatBloodPositionY4, 10, 10);
     ellipse(floatBloodPositionX5, floatBloodPositionY5, floatBloodWidthX1, floatBloodWidthY1);
     ellipse(floatBloodPositionX6, floatBloodPositionY6, floatBloodWidthX2, floatBloodWidthY2);
     ellipse(floatBloodPositionX7, floatBloodPositionY7, floatBloodWidthX3, floatBloodWidthY3);
     ellipse(floatBloodPositionX8, floatBloodPositionY8, 10, 10);
     ellipse(floatBloodPositionX9, floatBloodPositionY9, 10, 10);
     ellipse(floatBloodPositionX10, floatBloodPositionY10, 10, 10);
     ellipse(floatBloodPositionX11, floatBloodPositionY11, 10, 10);
     ellipse(floatBloodPositionX12, floatBloodPositionY12, 10, 10);
     ellipse(floatBloodPositionX13, floatBloodPositionY13, 10, 10);
     ellipse(floatBloodPositionX14, floatBloodPositionY14, 10, 10);
     ellipse(floatBloodPositionX15, floatBloodPositionY15, 10, 10);
     ellipse(floatBloodPositionX16, floatBloodPositionY16, 10, 10);
     ellipse(floatBloodPositionX17, floatBloodPositionY17, 10, 10);
     ellipse(floatBloodPositionX18, floatBloodPositionY18, 10, 10);
     ellipse(floatBloodPositionX19, floatBloodPositionY19, 10, 10);
     ellipse(floatBloodPositionX20, floatBloodPositionY20, 10, 10);
    
    //draws eclipse

    if (floatSun < 400 || floatSun > 700) {

      fill(57, 255, 20);
      ellipse(floatSun,50,100,100);
    }

    ellipse(floatSun,50,100,100);
    fill(0,0,0);
    ellipse(floatEclipsePlanetX, 60, 80, 80);

    if (floatEclipsePlanetX - floatSun < 50) {
      
     triangle(60, 700, floatEclipsePlanetX, 50, 400, 700 );
    
    }

    //draws slash

    fill(255,255,255);
    curve(floatCurveVertexX1, floatCurveVertexY1 ,200,300,600,400, floatCurveVertexX2, floatCurveVertexY2);

    //draws first guy

    fill(255,255,255);
    rect(50,300,50,250);
    ellipse(85,270,100,100);
    rect(70,330,125,30); 

     //draws bloodstain 

     fill (255, 0, 0);
     ellipse(425, 550, 200, 50);

    // draws second guy

    fill(150, 150, 150);
    rect(400, 300, 50, 250);
    ellipse(425, 270, 100, 100);

  }
  
}
 