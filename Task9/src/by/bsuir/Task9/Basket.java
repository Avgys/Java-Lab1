package by.bsuir.Task9;
import java.util.ArrayList;

import  by.bsuir.Task9.Ball;

public class Basket {
    private ArrayList<Ball> ballList;

    public Basket(){
        ballList = new ArrayList<Ball>();
    }

    public void addBall(Ball ball){
        this.ballList.add(ball);
    }

    public double getBasketWeight(){
        double totalWeight = 0;
        for (Ball ball : ballList){
            totalWeight += ball.weight;
        }

        return totalWeight;
    }

    public int countBallByColor(String color){
        int count = 0;
        for (Ball ball : ballList){
            if (ball.color == color){
                count++;
            }
        }
        return count;
    }
}
