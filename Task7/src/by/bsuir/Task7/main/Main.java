package by.bsuir.Task7.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        var array = new int[] {3,1,7,12,2,5,6};
        array = ShellSort(array);
        for (int i = 0; i < array.length; i++)
        System.out.println(array[i]);
    }

    public static int[] ShellSort(int[] array){
    var flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    flag = true;
                    var temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    i = i > 0 ? --i : 0;
                }
            }
        }
        return array;
    }
}