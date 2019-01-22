// Write a method called equals that takes in two string arrays
// and returns true if they are equal; that is, if both arrays
// have the same length and contain equivalent string values at each index.

import java.util.Arrays;

public class SC_EqualsStrings {
    public static void main(String[] args){
     
        System.out.println(equals(a, b));

    }
    public static boolean equals(String[] a, String[] b){
        return (a.length == b.length && Arrays.equals(a, b));
    }
}
