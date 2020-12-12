package lehigh;

import processing.core.PApplet;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class MovingBalls2 extends PApplet{
    int chance = 15;
    boolean a = true;
    ArrayList<Ball> ball;

     class Ball {
        float x, y, SpeedX, SpeedY, radius;
        Ball() {
             x = random(20, 480);
             y = random(20, 480);
             SpeedX = (float) Math.random() ;
             SpeedY = (float) Math.random() ;
             radius = 20;
        }
    }



    public  void Creation(Ball a){
        ellipse(a.x, a.y, a.radius, a.radius);
        fill(a.x/2);
    }

    public void Bounce(Ball a) {
            if (a.x - 20 < 0 || a.x + 20 > width) {
                a.SpeedX = -a.SpeedX;
            }
            a.x += a.SpeedX;


            if (a.y - 20 < 0 || a.y + 20 > height) {
                a.SpeedY = -a.SpeedY;
            }
            a.y += a.SpeedY;
        }

   public void Array()  {
       ball = new ArrayList<Ball>();
       for (int i = 0; i < 9; i++) {
           ball.add(i, new Ball());
       }
   }

   public void Mouse(){
        square((float) (mouseX - 15),(float)(mouseY - 15), 30);
    }


    public void settings() {
        size(500, 500);
       Array();
    }


    public void draw() {

        background(255);
        text(Integer.toString(chance), 100, 100);
        for (int i = 0; i < ball.size(); i++) {
            Creation(ball.get(i));
            Bounce(ball.get(i));
            Mouse();
        }


        }


    public static void main (String[]args){
        //Game game = new Game();
        //game.Click();
      //  game.Survival();
        System.out.println("---------Catch the Balls---------" + "\n\n" +
                           "Click the balls to catch all of them." + "\n" +
                           "You have 15 chances.");
        String[] processingArgs = {"MovingBalls2"};
        MovingBalls2 movingBalls2 = new MovingBalls2();
        PApplet.runSketch(processingArgs, movingBalls2);




    }
}
