import java.util.Arrays;
// Write a method called countInRange that accepts an array of
// integers, a minimum value, and a maximum value as parameters
// and returns the count of how many elements from the array fall
// between the minimum and maximum (inclusive).
public class Ex_countInRange {
    public static void main(String[] args){
        int[] a = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(a, 4, 17));
    }
    public static int countInRange(int[] a, int min, int max){
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] >= min && a[i] <= max){
                count++;
            }
        }
        return count;
    }
}
