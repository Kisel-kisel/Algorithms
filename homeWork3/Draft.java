package lessons;

import java.util.Scanner;

public class Draft{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число N для проверки являеться ли оно точной степенью следующего числа:");
//        int n = scanner.nextInt();
//        System.out.println("Введите число B для проверки:");
//        int b = scanner.nextInt();
//        int number = 0;
//        if (n>b){
//            for (int i = b; i <= n; i *= b) {
//                number = i;
////                System.out.println(i);
//            }
//        }
//        if (number == n){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
////        }
//        int a = scanner.nextInt();
//        int sum = 0;
//        int del = 10;
//        sum += a%del;
//        a = a/del;
//        sum += a%del;
//        a = a/del;
//        sum += a%del;
//        a = a/del;
//
//        System.out.println(a);
//        System.out.println(sum);
//
//        while (a>0){
//            sum += a%del;
//            a = a/del;
//        }
//        System.out.println(sum);

        int a = 0;
        int b = 1;
        int n = 6789;
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
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(sum);

    }
}
