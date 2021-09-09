package by.bsuir.Task1.Main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two params (real number with comma)");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / ( 1 + Math.pow(x * y, 2)  )));
        System.out.println(result);
    }
}
