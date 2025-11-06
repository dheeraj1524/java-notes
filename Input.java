import java.util.*;

class Input {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        System.out.println("Addition is " + c);
        System.out.println("Subtraction is " + d);
        System.out.println("Multiplication is " + e);
    }
}
