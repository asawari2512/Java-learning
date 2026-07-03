import java.util.*;
public class Program_4_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do{
            System.out.print("Enter 0 or 1: ");
            n = sc.nextInt();

            System.out.print("Enter your marks: ");
            int m = sc.nextInt();

            if(m >= 90)
                System.out.println("This is Good");
            else if(m >= 60)
                System.out.println("This is also Good");
            else
                System.out.println(("This is Good as well"));
        }while(n==1);
    }
}
