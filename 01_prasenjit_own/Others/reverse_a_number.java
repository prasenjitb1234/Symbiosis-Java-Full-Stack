import java.util.*;
public class reverse_a_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        int rev = 0 ;

        while(num!=0){
            rev = rev * 10 + num % 10 ;
            num = num / 10 ;
        }
        System.out.println("reversed number is : "+rev);



    }
}
