package Processing_Teoria;

import processing.core.PApplet;

import java.util.ArrayList;

public class AppCircles extends PApplet {
    private ArrayList<Ball> balls = new ArrayList<>();
    public void settings() {
        size(500, 500);
        balls.add(new Ball(this, width/2, height/2));
    }

    public void draw() {
        background(64);
        ellipse(mouseX, mouseY, 50, 50);
        for(Ball b : balls){
            b.step();
            b.render();
        }
    }

    public void mouseDragged(){
        balls.add(new Ball(this, mouseX, mouseY));
    }
    public static void main(String[] args) {
        String[] processingArgs = {"RectangulosApp"};
        AppCircles mySketch = new AppCircles();
        PApplet.runSketch(processingArgs, mySketch);

    }

}
