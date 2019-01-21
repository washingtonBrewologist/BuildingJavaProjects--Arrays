import java.util.Arrays;

public class OddsArray {
    public static void main(String[] args){
        int min = -5;
        int[] data = new int[22];
        data[0] = min;
        for (int i = 1; i < data.length; i++){
            data[i] = data[i - 1] + 2;
        }
        System.out.println(Arrays.toString(data));
    }


}
