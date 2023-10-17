import java.util.Arrays;

public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("harry potter and the shmorcererors shmone")));
    }

    public static char[] stringToArray(String string) {
        //Question 5
        char[] charArray = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }
}
