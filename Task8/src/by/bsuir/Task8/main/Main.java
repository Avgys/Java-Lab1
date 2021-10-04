package by.bsuir.Task8.main;

public class Main {

    public static void main(String[] args) {

        var array1 = new int[] {2,4,6,7};
        var array2 = new int[] {1,3,4,5,8,9};
        func(array1,array2);
    }

    public static void func(int[] array1, int[] array2){

        var countOfInserted = 0;
        var offset = 0;

        for (int i = 0; i < array2.length; i++){
            boolean isInserted = false;
            var startPos = countOfInserted > 0 ? countOfInserted - 1 : 0;
            for (int j = startPos; j < array1.length; j++){
                if (array2[i] <= array1[j]){
                    System.out.printf("pos: %d \n", offset++ + j);
                    countOfInserted++;
                    isInserted = true;
                    break;
                }
            }
            if (!isInserted){
                System.out.printf("pos: %d \n", offset++ + array1.length);
            }
        }
    }


}