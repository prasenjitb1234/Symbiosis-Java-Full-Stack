package question;

import java.util.HashSet;
import java.util.Set;

public class ArrayCheck {
    public static boolean isArrayCheck(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        
        
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        
        if (set.size() != n) {
            return false;
        }
        

        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isArrayCheck(new int[]{1, 2, 0, 3})); 
        System.out.println(isArrayCheck(new int[]{0, 1, 2, 2, 3})); 
        System.out.println(isArrayCheck(new int[]{0})); 
    }
}