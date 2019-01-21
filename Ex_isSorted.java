// Write a static method named isSorted that accepts an array of doubles
// as a parameter and returns true if the list is in sorted (nondecreasing)
// order and false otherwise.

public class Ex_isSorted {
    public static void main(String[] args){
        double[] a ={4.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(a));
    }
    public static boolean isSorted(double[] a){
        boolean temp = false;
        if (a.length == 1){
            return true;
        }
        for (int i = 0; i < a.length -1; i++){
            if (a[i + 1] > a[i]){
                temp = true;
            } else {
                return false;
            }
        }
        return temp;
    }
}
