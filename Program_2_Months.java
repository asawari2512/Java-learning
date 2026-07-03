import java.util.*;
public class Program_2_Months {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of month: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sup");
                break;
            case 10:
                System.out.println("Opt");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Enter valid number!!!");

        }

    }
}
