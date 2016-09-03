/**
 * Created by Owner on 9/3/2016.
 */
public class ArraysAndStrings {
    public static void main (String[] args){
        System.out.println(isUnique("abcdef"));
    }

    public static Boolean isUnique(String a) {
        int[] arr = new int[256];
        for (int i = 0; i < a.length(); i++) {
            int ascii = (int) a.charAt(i);
            System.out.println(ascii);
            if (arr[ascii] == 1){
                return false;
            }
            arr[ascii] = 1;
        }
        return true;
    }
}
