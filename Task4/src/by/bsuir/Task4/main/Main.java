package by.bsuir.Task4.main;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n){
        int i, m=0;
        m= n / 2;
        if(n == 0 || n == 1){
            return false;
        }else{
            for(i = 2; i <= m; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N");
        int N = in.nextInt();
        int[] numArray = new int[N];
        for(int i = 0; i < N; i++){
            numArray[i] = in.nextInt();
        }

        for(int i = 0; i < N; i++){
            if (isPrime(numArray[i])){
                System.out.println(i);
            }
        }
    }
}