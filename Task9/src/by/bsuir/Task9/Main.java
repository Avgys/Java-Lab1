package by.bsuir.Task9;

import by.bsuir.Task9.Basket;
import by.bsuir.Task9.Ball;

public class Main {

    public static void main(String[] args) {

        var basket = new Basket();

        basket.addBall(new Ball(2, "red"));
        basket.addBall(new Ball(2, "red"));
        basket.addBall(new Ball(2, "green"));

        System.out.printf("weight:%.1f \n",basket.getBasketWeight());
        System.out.printf("count:%d \n",basket.countBallByColor("red"));
    }
}