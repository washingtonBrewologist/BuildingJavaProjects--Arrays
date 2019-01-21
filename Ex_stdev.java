//Write a method called stdev that returns the standard deviation of an array of integers.
import java.util.Arrays;

public class Ex_stdev {
    public static void main(String[] args){
        int[] a = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        stdev(a);
    }

    public static double stdev(int[] a){
        // Get mean of array

        int count = 0;
        int sum = 0;
        double average;

        for (int n : a){
            count++;
            sum+=n;
        }
        double[] b = new double[a.length];
        average =  (double)sum / count;
        double dif;
        for (int i = 0; i < a.length; i++){
            dif = Math.pow(a[i] - average, 2);
            b[i] = dif;
        }
        int count2=0;
        double sum2 =0;
        for (double k : b){
            count2++;
            sum2 += k;
        }
        count2--;
        System.out.println(Math.sqrt(sum2 / count2));
        return (Math.sqrt(sum2 / count2));
    }
}
