import java.util.*;

public class Program_5_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<(n-1); i++){
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (n <= 1)
            System.out.println("Not a prime number");
        else if(isPrime)
            System.out.println("a prime number");
        else
            System.out.println("Not a prime number");
    }
}
