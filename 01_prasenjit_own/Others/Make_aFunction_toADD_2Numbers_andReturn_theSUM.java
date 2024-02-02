import java.util.Scanner;

public class Make_aFunction_toADD_2Numbers_andReturn_theSUM {

    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("the sum of two numbers is : "+ sum);
    }
}
