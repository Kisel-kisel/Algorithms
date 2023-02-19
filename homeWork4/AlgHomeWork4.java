import java.util.Arrays;

public class AlgHomeWork4 {
    public static void main(String[] args) {
        int arrA[] = {100, 112, 256, 349, 770};
        int arrB[] = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        number(arrA,arrB,k);


    }
    public static int number(int[] arrA, int[] arrB, int k){
    int arrLength = arrA.length + arrB.length;
    int[] arrNew = new int[arrLength];
    int size = 0;
        for (int i = 0; i < arrA.length; i++) {
         arrNew[i] = arrA[i];
         size++;
        }
        for (int i = 0; i < arrB.length ; i++) {
        arrNew[size] = arrB[i];
        size++;
        }

        Arrays.sort(arrNew);
        System.out.println(Arrays.toString(arrNew));
        System.out.println(arrNew[k]);
        return arrNew[k];
    }
}
