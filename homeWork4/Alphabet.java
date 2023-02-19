import java.util.Arrays;

public class Alphabet {
    public static char[] method(String str){
        String string = str.toUpperCase();
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }
        Arrays.sort(chars);
        System.out.println(chars);
        return chars;
    }


    public static void main(String[] args) {
        String str = "poiuytrewqlkjhgfdsamnbvcxz";
        method(str);
    }
}
