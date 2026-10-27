public class SecondLargestDistinct {
    static void main() {
        int[] num = {5, 5, 5};
        int largestNum = num[0];

        for(int i=0; i<num.length; i++){
            if (num[i] > largestNum) {
                largestNum = num[i];
            }
        }

        int secondLargestNum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            if (num[i] > secondLargestNum && num[i] != largestNum) {
                secondLargestNum = num[i];
            }
        }
        if(secondLargestNum == Integer.MIN_VALUE) {
            System.out.println("Second Largest Number Not Exist");
        }
        else {
            System.out.println("Second Largest Distinct: " + secondLargestNum);
        }
    }
}
