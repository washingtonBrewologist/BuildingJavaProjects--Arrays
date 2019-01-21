//Write a method named minGap that accepts an integer array
//as a parameter and returns the minimum 'gap' between adjacent
//values in the array.
public class Ex_minGap {
    public static void main(String[] args){
        int[] a = {3, 5, 11, 4, 8};
        System.out.println(minGap(a));
    }
    public static int minGap(int[] a){
        if (a.length  < 2){
            return 0;
        }
        int minTest;
        int min = a[1] - a[0];
        for (int i = 2; i < a.length -1; i++){
            minTest = a[i + 1] - a[i];
            if (minTest < min){
                min = minTest;
            }
        }
        return min;
    }
}
