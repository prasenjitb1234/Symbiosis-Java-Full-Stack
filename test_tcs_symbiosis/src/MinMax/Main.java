package MinMax;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] minMax = MinMax.minmax(arr);
        System.out.println("Minimum is: " + minMax[0]);
        System.out.println("Maximum is: " + minMax[1]);
    }
}
