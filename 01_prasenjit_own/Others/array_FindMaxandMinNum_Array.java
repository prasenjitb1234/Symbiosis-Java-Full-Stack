import java.util.Scanner;
public class array_FindMaxandMinNum_Array {
    public static void findMaxandMin(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum is : "+max);
        System.out.println("Mininum is : "+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        // taking numbers in array
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        findMaxandMin(arr);


    }
}
