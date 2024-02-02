import java.util.Scanner;
public class reverse_a_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = "ABCD";
        String rev = " ";

        int len = str.length();

        for(int i = len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is: "+rev);





    }
}
