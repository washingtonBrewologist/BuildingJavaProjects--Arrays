// Write a method called kthLargest that accepts an integer k and an
// array a as its parameters and returns the element such that k elements
// have greater or equal value.
import java.util.Arrays;

public class Ex_kthLargest {
    public static void main(String[] args){
        int[] a = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(kthLargest(2,a));
    }

    public static int kthLargest(int value, int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return a[a.length - value - 1];
    }
}
