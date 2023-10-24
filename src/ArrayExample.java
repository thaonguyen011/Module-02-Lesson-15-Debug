import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom(int size) {
        Random rd = new Random();
        Integer[] arr = new Integer[size];
        System.out.println("Elements of list: ");
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt();
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput random index");
        int index = scanner.nextInt();

        try {
            System.out.println("Value of element at index: " + index +" is " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of the bounds");
        }
    }
}
