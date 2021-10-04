package by.bsuir.Task7.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N");
        int N = in.nextInt();
        double[] numList = new double[N];
        for(int i = 0; i < N; i++){
            numList[i] = in.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(numList[(j + i) % (N)]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}