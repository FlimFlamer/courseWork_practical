import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printSplitString("123456789");
    }
    public static void printSplitString (String str){
        char[] chars = str.toCharArray();
        int size = str.length();
        int half;
        if (size % 2 == 0){
            half = size / 2;
        } else {
            half = size / 2 +1;
        }
        char a [] = Arrays.copyOfRange(chars, 0, half);
        char b [] = Arrays.copyOfRange(chars, half, size);
        System.out.println(a);
        System.out.println(b);
    }
}
