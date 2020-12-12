package lehigh;

import processing.core.PApplet;

public class Game extends MovingBalls2{


    void Click(){
        if(mousePressed){
            for (int i = 0; i < 9; i++) {
                if(Math.abs(ball.get(i).x - mouseX) <= 30 && Math.abs(ball.get(i).y - mouseY) <= 30){
                    ball.remove(i);
                    a = true;
                    break;
                }
            }
        }
    }

    void Survival(){
        if(!a){
            chance -= 1;
        }
        if(chance == 0){
            ball.clear();
            System.out.println("Failed" +"\n" + "Click to try again");
            if(mousePressed){
                for (int q = 0; q < 9; q ++){
                    ball.add(new Ball());
                }
                Click();
            }
        }
    }

}
