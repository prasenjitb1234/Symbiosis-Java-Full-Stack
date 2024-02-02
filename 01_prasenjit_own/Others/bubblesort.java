import java.util.Scanner;
public class bubblesort {
    // bubble sort

        public static void printArray(int arr[]){
            System.out.println("The sorted elements are: ");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            // int arr[] = {7,8,3,1,2};

            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter elements: ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printArray(arr);

        }
    }

