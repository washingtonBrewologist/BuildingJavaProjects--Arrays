// Write a method countStrings that takes an array of Strings and a target
// String and returns the number of occurences target appears in the array.

public class SC_CountStrings {
    public static void main(String[] args){
        String[] a = {"foo", "true", "blue", "foo", "clue", "moo", "foo"};
        System.out.println(countStrings(a, "foo"));

    }
    public static int countStrings(String[] a, String target){
        int counter = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i].equals(target)){
                counter++;
            }

        }
        return counter;
    }
}
