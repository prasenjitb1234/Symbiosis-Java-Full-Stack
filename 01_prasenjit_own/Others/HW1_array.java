// take an array of names as input from user and print them on screen  .

import java.util.Scanner;
public class HW1_array {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        String names[] = new String[size];
        System.out.println("Enter names : ");
        for (int i = 0 ; i<size; i++){
            names[i] = sc.next();
        }

//        method 1
//        for(int i = 0 ; i<names.length; i++){
//            System.out.println(names[i]);
//        }

//            method 2
        for(int i = 0 ; i<size; i++){
            System.out.println(names[i]);
        }
    }
}
