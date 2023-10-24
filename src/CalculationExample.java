import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculation(x, y);
    }

    private void calculation(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Addition of x and y = " +a);
            System.out.println("Subtraction of x and y = " + b);
            System.out.println("Multiplication of x and y = " + c);
            System.out.println("Division of x and y = " + d);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
