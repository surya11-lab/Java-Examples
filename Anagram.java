import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args ) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        String str1 = myscanner.nextLine();

        System.out.print("Enter the Second String: ");
        String str2 = myscanner.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        myscanner.close();
    }
    
}
