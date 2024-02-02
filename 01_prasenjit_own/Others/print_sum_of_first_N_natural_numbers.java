import java.util.Scanner;

public class print_sum_of_first_N_natural_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
