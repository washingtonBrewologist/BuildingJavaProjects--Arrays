// What is wrong with the following code? Correct the bugs to produce the following expected output:
//[Solved]
import java.util.Arrays;

public class ArrayBugs {
    public static void main(String[] args){
        int[] first = new int[2];
        first[0] = 3;
        first[1] = 7;
        int[] second = new int[2];
        second[0] = 3;
        second[1] = 7;

        if (Arrays.equals(first, second)){
            System.out.println("They contain same elements");
        } else {
            System.out.println("They are different");
        }
    }
}
