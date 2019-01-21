//Write a method called allLess that accepts two arrays of
// integers and returns true if each element in the first
// array is less than the element at the same index in the second array.

public class SC_allLess {
    public static void main(String[] args){
        int[] a = {22, 11, 98, -4};
        int[] b = {50, 41, 600, 1};
        System.out.println(allLess(a, b));
    }
    public static boolean allLess(int[] a, int[] b){
        if (a.length != b.length){
            return false;
        }
        boolean temp = false;
        for (int i = 0; i < a.length; i++){
            if (a[i] < b[i]){
                temp = true;
            } else {
                return false;
            }
        }
        return temp;
    }
}
