import java.util.Arrays;
/*
* Write a method called max that accepts an array of integers as a parameter and returns the maximum value in the array.
* For example, if the array passed stores {12, 7, -1, 25, 3, 9}, your method should return 25.
* You may assume that the array contains at least one element. Your method should not modify the elements of the array.
*
* */
public class SC_Max {
    public static void main(String[] args){
        int[] list = {42};
        max(list);
    }
    public static int max(int[] list){
       int max = list[0];

       for (int i = 1; i < list.length; i++){
           int num = list[i];
           if (num > max){
               max = num;
           }
       }
        System.out.println(max);
       return max;
    }
}
