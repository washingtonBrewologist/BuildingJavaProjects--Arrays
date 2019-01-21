//Write a method named lastIndexOf that accepts an array of
// integers and an integer value as its parameters and returns
// the last index at which the value occurs in the array.

import java.util.Arrays;

public class Ex_lastIndexOf {
    public static void main(String[] args){
        int[] a = {74, 85, 101, 102, 102, 85, 56};
        System.out.println(lastIndexOf(a, 102));
    }
    public static int lastIndexOf(int[] a, int target){
        int pos;
        for (int i = a.length-1; i >= 0; i--) {
                if (a[i] == target) {
                    pos = i;
                    return pos;
                }
            }
        return -1;
    }
}
