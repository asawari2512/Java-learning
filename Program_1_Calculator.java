import java.util.*;

public class Program_1_Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Select operations below:\n1:Addition\n2:Subtraction\n3:Multiplecation\n4:Division\n5:Remainder");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Addition is " + a+b);
                break;
            case 2:
                System.out.println("Subtraction is " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication is " + a*b);
                break;
            case 4:
                System.out.println("Division is " + a/b);
                break;
            case 5:
                System.out.println("Remainder is " + a%b);
                break;
            default:
                System.out.println("Enter valid operation");
        }
    }
}
