import java.util.*;

public class Program_9_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int pos = 0;
        int neg = 0;
        int zeros = 0;
        do{
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if(n>0){
                pos = pos+1;
            }
            if(n<0){
                neg = neg+1;
            }
            if(n==0){
                zeros = zeros+1;
            }

        }while(n != 999);
        System.out.println("Positive number : " + pos);
        System.out.println("Negative number : " + neg);
        System.out.println("Zeros : " + zeros);



    }
}
