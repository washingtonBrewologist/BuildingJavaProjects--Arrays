//Write a static method named range that takes an array of integers as a
// parameter and returns the range of values contained in the array. The
// range of an array is defined to be one more than the difference between
// its largest and smallest element.

import java.util.Arrays;

public class Ex_range {
    public static void main(String[] args){
        int[] a = {8, 3, 5, 7, 2, 4};
        System.out.println(range(a));
    }
    public static int range(int[] a){
       int[] b = new int[a.length];
       for (int i = 0; i < a.length; i++){
           b[i] = a[i];
       }
        Arrays.sort(b);
        return (b[b.length-1] - b[0]) + 1;

    }
}
