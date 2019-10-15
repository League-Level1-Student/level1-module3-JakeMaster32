int x = 35;
int y = 400;
int birdYVelocity = 30;
int birdXVelocity = 30;
int gravity = 1;
void setup() {
size(800, 800);
}
void draw() {
background(#00CAFF);
fill(#FCFC17);
stroke(#050505);
ellipse(x,y, 40, 40);
fill( 0,255,0);
y = y + gravity;
}
void mousePressed() {
y = y- birdYVelocity;
}
