import java.util.*;
public class function3_find_factorial {
    public static void printFactorial(int n){
        // loop
        int factorial = 1;
        for(int i = n ; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printFactorial(n);


    }
}
