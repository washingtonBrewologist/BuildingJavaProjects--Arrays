import java.util.Arrays;

public class Ex_median {
    public static void main(String[] args){
        int[] a = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(median(a));
    }

    public static int median(int[] a){
        Arrays.sort(a);
        return a[a.length / 2];
    }
}
