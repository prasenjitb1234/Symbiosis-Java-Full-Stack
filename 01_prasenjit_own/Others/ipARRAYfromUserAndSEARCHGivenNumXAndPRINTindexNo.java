// take an array as input from user. Search for a given num x and print index at which it occurs.
// this is also a linear search .
import java.util.Scanner;

public class ipARRAYfromUserAndSEARCHGivenNumXAndPRINTindexNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0 ; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number to search index: ");
        int x = sc.nextInt();

        for(int i = 0 ; i< numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at : "+ i);
            }
        }
    }
}
