package stringtest;

public class StringTest {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d%8d%n", i, 2 + 2 * i + array[i]);

        }
    }

}
