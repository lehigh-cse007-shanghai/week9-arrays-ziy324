package lehigh;

import processing.core.PApplet;

import java.util.ArrayList;

public class BubbleSort extends PApplet {
        int[] arr = {15, 8, 6, 11, 1, 3, 9};
        float[] x = {20, 70, 120, 170, 220, 270, 320};
        float y = 130;


        public void swap(int i, int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

    public void bubbleSort(){
        for (int i = 0; i < arr.length - 1; i++) {
        }

    }

        public void settings() {
            size(500, 500);
        }

        public void draw(){
            background(255);

            for(int i = 0; i < arr.length - 1; i ++) {
                  textSize(20);
                  fill(255,0,255);
                  if(arr[i] > arr[i+1]) {
                      fill(127, 255, 170);
                      swap(i, i + 1);
                  }
            if (arr[0] > arr[arr.length-1]){
                fill(127,255,170);
                swap(arr[0],arr[arr.length-1]);
            }
                  text(Integer.toString(arr[i]), x[i], y);
            }
            delay(1000);
        }

        public static void main (String[]args){
            String[] processingArgs = {"BubbleSortTextProcessing"};
            BubbleSort bubbleSortTextProcessing = new BubbleSort();
            PApplet.runSketch(processingArgs, bubbleSortTextProcessing);
        }
    }