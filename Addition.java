public class Addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("Addition = " + sum);
    }
}import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Addition = " + sum);
    }
}
