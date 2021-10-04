package by.bsuir.Task2.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two params (real number with comma)");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (((y >= 0 && y <= 5) && (x >= -4 && x <= 4)) || ((y < 0 && y >= -3) && (x >= -6 && x <= 6))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
