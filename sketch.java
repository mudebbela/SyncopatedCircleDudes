float t = 0;

void setup(){
  size(500,500);
  background(0);
  fill(100);  // Set fill to gray
  ellipse(width/2, height/2, 50, 50); 
}

void draw(){
  float colorSpeed = map(mouseX, 0, 500, -200, 200);
  float mappedT = map(sin(t/5), -1, 1, 0, 255);
  background((255-mappedT),23,mappedT, t);
  int orbit = 100;
  //float y = sin(t/100)*orbit;
  translate(width/2, height/2);
  
  for(int i = -10; i<5; i++){
    ellipse(getX(0, orbit, i), getY(0, orbit, i), 250,250);
  }
  
  stroke(255, 127);
  noFill();
//  ellipse(getX(0, orbit, 1), getY(0, orbit, 1), 100,100);
//  ellipse(getX(100, orbit, 2),getY(100, orbit, 2),100,100);
  t+=colorSpeed/1000;
}

float getY(float offset, float orbit, float speed){
  return sin((speed*t+offset)/100)*orbit;
}

float getX(float offset, float orbit, float speed){
  return cos((speed*t+offset)/100)*orbit;
}
