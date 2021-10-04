package by.bsuir.Task5.main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int getK(ArrayList<Integer> numList){
        int i = 0;
        int total = 0;

        while (((i + 1) < numList.size()) && (numList.get(i) < numList.get(i + 1))){
            i++;
        }

        if (((i + 1) < numList.size()) && (numList.get(i) >= numList.get(i + 1))){
            ArrayList<Integer> arr1 = new ArrayList<Integer>(numList);
            arr1.remove(i);
            ArrayList<Integer> arr2 = new ArrayList<Integer>(numList);
            arr2.remove(i + 1);
            int k1 = 1 + getK(arr1);
            int k2 = 1 + getK(arr2);
            total += Math.min(k1, k2);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N");
        int N = in.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>(N);
        for(int i = 0; i < N; i++){
            numList.add(in.nextInt());
        }

        int k = getK(numList);
        System.out.println(k);
    }
}