//Write a method called mode that returns the most frequently occurring element of an array of integers

public class Ex_mode {
    public static void main(String[] args){
        int[] a = {27, 15, 15, 11, 27};
        System.out.println(mode(a));
    }
    public static int mode(int[] a){
        int[] newA = new int[101];

        for (int i = 0; i < a.length; i++){
            newA[a[i]]++;
        }
        int mode = 101;
        int count = 0;

        for (int i = 0; i < newA.length; i++){
            if (newA[i] > count){
                count = newA[i];
                mode = i;
            }
        }
        return mode;
    }
}
