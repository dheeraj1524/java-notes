import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();


        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;


        System.out.println("Binary of first integer: " + Integer.toBinaryString(num1));
        System.out.println("Binary of second integer: " + Integer.toBinaryString(num2));
        System.out.println("Bitwise AND: " + Integer.toBinaryString(andResult));
        System.out.println("Bitwise OR: " + Integer.toBinaryString(orResult));
        System.out.println("Bitwise XOR: " + Integer.toBinaryString(xorResult));
    }
}
