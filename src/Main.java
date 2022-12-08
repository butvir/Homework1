import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1, 2, 5, 6, 4, 10, 8, 9};
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a, 0,8);
//        System.out.println(Arrays.toString(a));
//        int key = Arrays.binarySearch(a, 12);
//        System.out.println(key);

        Person person1 = new Person("Петров Иван Иванович", 56, false);
        Person person2 = new Person("Петров Иван Иванович", 56, false);
        Person person3 = person1;

        System.out.println("person1 == person2? " + (person1 == person2));
        System.out.println("person1 == person3? " + (person1 == person3));

        System.out.println("person1.equals(person2)? " + person1.equals(person2));
        System.out.println("person1.equals(person3)? " + person1.equals(person3));

    }
}