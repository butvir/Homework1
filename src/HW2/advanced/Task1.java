package HW2.advanced;

public class Task1 {
    public static void main(String[] args) {
        double increment = 0.01123;
        double result = 0;
        int i = 0;

        while (result < 1_000_000){
            if (increment < 0){
                break;
            }
            result +=increment;
            i++;
        }

        if (i > 0){
            System.out.println(i);
        }
    }
}
