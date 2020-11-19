package lehigh;

import processing.core.PApplet;

import java.util.Arrays;

public class MovingBalls extends PApplet {
    int num = (int) (Math.random() * 10 + 3);
    float[] x = new float[num];
    float[] y = new float[num];
    float[] SpeedX = new float[num];
    float[] SpeedY = new float[num];
    float radius = 20;

    public void settings() {
        size(500, 500);
        for (int temp = 0; temp < num; temp++) {
            x[temp] = random(radius, width - radius);
            y[temp] = random(radius, height - radius);
            SpeedX[temp] = (float) Math.random() * 5;
            SpeedY[temp] = (float) Math.random() * 5;
        }
        //Arrays.fill(SpeedX, (float) Math.random()*5);
        //Arrays.fill(SpeedY,(float)Math.random()*5);
    }

    public void draw() {

        background(255);

        for (int i = 0; i < num; i++) {

            ellipse(x[i], y[i], 20, 20);
            fill(x[i]/2);

            if (x[i] - radius < 0 || x[i] + radius > width) {
                SpeedX[i] = -SpeedX[i];
            }
            x[i] += SpeedX[i];


            if (y[i] - radius < 0 || y[i] + radius > height) {
                SpeedY[i] = -SpeedY[i];
            }
            y[i] += SpeedY[i];

            for (int j = 0; j < num; j++){
                float X = Math.abs(x[i] - x[j]);
                float Y = Math.abs(y[i] - y[j]);
                if(X <= 60 && Y <= 60){
                    line(x[i],y[i],x[j],y[j]);
                }
            }

        }

    }


        public static void main (String[]args){
            String[] processingArgs = {"MovingBalls"};
            MovingBalls movingBalls = new MovingBalls();
            PApplet.runSketch(processingArgs, movingBalls);
        }
    }
