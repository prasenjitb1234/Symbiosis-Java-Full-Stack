import java.util.Scanner;
public class palindrome1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("enter a number : ");
        num = sc.nextInt();

        int orgNum = num;

        int rev = 0 ;
        while(num!=0){
            rev = rev * 10 + num % 10 ;
            num = num / 10 ;
        }
        if(orgNum==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
