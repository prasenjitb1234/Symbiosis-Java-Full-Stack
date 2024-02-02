import java.util.Scanner;
public class RECURSION_1 {
    public static void printNumb(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args){

        int n = 5;
        printNumb(n);  // n = 5


    }
}
