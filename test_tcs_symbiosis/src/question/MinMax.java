package question;

import java.util.Arrays;

public class MinMax {
    public static int[] findMaxandMin(int arr[]){
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

        
        int[] r = {min,max};
        return r;
    }
    public static void main(String args[]){
        
        int arr1[] = {1,2,3,4,5};

       int arr2[]  =  MinMax.findMaxandMin(arr1);;


        System.out.println(Arrays.toString(arr2));
        
        
        
    }
}
