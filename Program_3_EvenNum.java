import java.util.*;
public class Program_3_EvenNum {
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
