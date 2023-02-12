package lessons;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        while (sum<n){

            sum = a + b;
            a = sum;
            sum = a + b;
            b = sum;

            if (a < n ){
                System.out.print(a + ", ");
            }
            if (b < n){
                System.out.print(b + ", ");
            }

        }
    }
}
