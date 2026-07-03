import java.util.*;

public class Program_13_StringBuilder {
    public static void main(String[] args) {
        
//        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb);
//
////        *Get character
//        System.out.println(sb.charAt(0));
//
////        *Set character
//        sb.setCharAt(0, 'H');
//        System.out.println(sb);
//
////        *Insert character
//        sb.insert(0, "hey... ");   //(insert something at any location)
//        System.out.println(sb);
//
////        *delete character
//        sb.delete(3, 4);    //(delete character at index 1 and put index 2 character at that location)
//        System.out.println(sb);
//
////        *Append character
//        sb.append(" world");  //(Add string at end)
//        System.out.println(sb);
//
////        *length of String
//        System.out.println(sb.length());






////        *Reverse String
//
//        StringBuilder str = new StringBuilder("Asawari");
//
//        for (int i=0; i<str.length()/2; i++){
//
//            int front = i;
//            int back = str.length() - 1 - i;
//
//            char frontChar = str.charAt(front);
//            char backChar = str.charAt(back);
//
//            str.setCharAt(front, backChar);
//            str.setCharAt(back, frontChar);
//        }
//        System.out.println(str);






//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        sc.nextLine();
//
//        StringBuilder[] ary = new StringBuilder[size];
//        int length = 0;
//
//        for (int i=0; i<size; i++){
//            ary[i] = new StringBuilder(sc.next());
//            length += ary[i].length();
//        }
//
//        System.out.println(length);







//        StringBuilder org = new StringBuilder("eabcdef");
//        StringBuilder result = new StringBuilder("");
//
//        for (int i=0; i<org.length(); i++){
//            if (org.charAt(i) == 'e')
//                org.setCharAt(i, 'i');
//
//        }
//        result = org;
//        System.out.println(result);





//        Scanner sc = new Scanner(System.in);
//
//        StringBuilder str = new StringBuilder(sc.next());
//        StringBuilder userName = new StringBuilder("");
//
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i) == '@'){
//                break;
//            }else
//                userName.insert(i, str.charAt(i));
//        }
//        System.out.println("UserName : " + userName);
    }
}
