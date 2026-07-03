import java.util.*;

public class Program_8_Function {
//    public static int Mult(int a, int b){
//        return a*b;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(Mult(a, b));
//    }






//    public static int Factorial(int n){
//        if (n<0) {
//            System.out.println("Enter valid Number");
//            return 0;
//        }
//        int factorial = 1;
//        for(int i=n; i>=1; i--){
//            factorial = factorial*i;
//        }
//        return factorial;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println(Factorial(n));
//    }





//    public static void isPrime(int n){
//
//        boolean isPrime = true;
//        for(int i=2; i<n; i++){
//            if(n%i == 0) {
//                isPrime = false;
//                continue;
//            }
//        }
//        if(isPrime){
//            if(n == 1){
//                System.out.println("Not prime nor not prime");
//            }
//            else
//                System.out.println("Prime number");
//        }
//        else
//            System.out.println("Not prime number");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        isPrime(n);
//    }






//    public static void evenOdd(int n){
//        if(n%2 == 0)
//            System.out.println("Even number");
//        else
//            System.out.println("Odd number");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        evenOdd(n);
//    }





//    public static void table(int n){
//        if(n<0)
//            System.out.println("Enter Valid number");
//        for(int i=1; i<=10; i++){
//            System.out.println(i*n);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        table(n);
//    }








//    public static int avg(int a, int b, int c){
//        int avg = (a+b+c)/3;
//        return avg;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        System.out.println(avg(a, b, c));
//    }






//    public static int sum(int n){
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            if(i%2 != 0)
//                sum = sum+i;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println(sum(n));
//    }








//    public static int greaterNum(int a, int b){
//        if(a>b)
//            return a;
//        else
//            return b;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("Greater Number is " + greaterNum(a, b));
//    }









//    public static double circumference(int r){
//        return 2*3.14*r;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//
//        System.out.println(circumference(r));
//    }






//    public static void canVote(int a){
//        if(a <= 0) {
//            System.out.println("Enter valid number");
//            return;
//        }
//        if(a >= 18)
//            System.out.println("Can Vote");
//        else
//            System.out.println("Can't Vote");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        canVote(a);
//    }










//    public static int power(int x, int n){
//        int result = 1;
//        for(int i=0; i<n; i++){
//            result = result*x;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//
//        System.out.println(power(x,n));
//    }






//    public static int comDivisor(int a, int b){
//        int temp;
//        while(b != 0) {
//            temp = b;
//            b = a % b;
//            a = b;
//            return a;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("GCD is : " + comDivisor(a,b));
//
//    }



//    public static void fibo(int n){
//        int a = 0;
//        System.out.println(a);
//        int b = 1;
//        System.out.println(b);
//        int c = 0;
//        for(int i=0; i<n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.println(b);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        fibo(n);
//    }






}
