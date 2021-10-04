package by.bsuir.Task3.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input three params (real number with comma)");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double h = in.nextDouble();
        while (x <= y){
            System.out.println(Double.toString(x) + " | " + Double.toString(Math.tan(x)));
            x += h;
        }
    }
}
