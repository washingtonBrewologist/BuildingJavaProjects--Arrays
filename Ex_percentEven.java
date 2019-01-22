//Write a method called percentEven that accepts an
//array of integers as a parameter and returns the percentage
//of even numbers in the array as a real number.

public class Ex_percentEven {
    public static void main(String[] args){
        int[] a = {6, 2, 9, 11, 3};
        System.out.println(percentEven(a));
    }
    public static double percentEven(int[] a){
        int count = 0;
        if (a.length == 0){
            return 0.0;
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                count++;
            }
        }
        return ((double)count / a.length) * 100;
    }
}
