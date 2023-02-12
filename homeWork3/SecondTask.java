package lessons;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        int a = 179;
        int sum = 0;
        int del = 10;
        sum += a%del;
        a = a/del;
        sum += a%del;
        a = a/del;
        sum += a%del;
        a = a/del;

        System.out.println(a);
        System.out.println(sum);

        while (a>0){
            sum += a%del;
            a = a/del;
        }
        System.out.println(sum);

    }
}
