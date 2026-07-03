import java.util.*;

public class Program_14_BitManipulation {
    public static void main(String[] args) {

///       Get Bit (Here we find out the positional bit is zero or one)
//        int n = 5; ///n=5(0101)
//        int pos = 2;
//        int bitMask = 1<<pos;
//
//        if((bitMask & n) == 0)
//            System.out.println("bit is zero");
//        else
//            System.out.println("bit is one");




///       Set bit(Here we set the positional bit (0 to 1) and print the generated number)
//        int n = 5;
//        int pos = 1;
//
//        int bitMask = 1<<pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);






///        Clear bit (Here we clear the positional bit (1 to 0) and print the generated number)
//        int n = 5;
//        int pos = 2;
//
//        int bitMask = 1<< pos;
//
//        int newBitMask = ~(bitMask);
//
//        int newNumber = newBitMask & n;
//        System.out.println(newNumber);






///        Update bit (Here we convert bit from (0 to 1 OR 1 to 0))
        int n = 5;
        int pos = 1;

///        Convert from (0 to 1)
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);


///        Convert from (1 to 0)
//        
    }
}