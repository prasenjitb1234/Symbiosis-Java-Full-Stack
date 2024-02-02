import java.util.Scanner;
public class palindrome_string {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.next();

        String rev = "";  // Initialize without a space

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Use equals() method for content comparison
        if (str.equals(rev)) {
            System.out.println(rev + " - It is a palindrome");
        } else {
            System.out.println(rev + " - is not a palindrome");
        }
    }
}
