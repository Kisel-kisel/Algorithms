package lessons;

import java.util.Scanner;
import java.util.Stack;

public class TaskFour {
    public static void main(String[] args) {
        String str = "abccba";
        String string = "";
        for (int i = str.length()-1; i > -1; i--) {
            char element = str.charAt(i);
            string += element;
        }
        System.out.println(string);

        if (str.equals(string)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
