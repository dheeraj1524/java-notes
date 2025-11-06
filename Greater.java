import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. = ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("1st no. is greater than 2nd no.");
        }else{
            System.out.println("2nd no. is greater than 1st no.");
        }

    }

}
