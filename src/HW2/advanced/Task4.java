package HW2.advanced;

public class Task4 {
    public static void main(String[] args) {
        String s = "Hello world";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'l' ){
            chars[i] = 'r';
            }


        }
    }
}
