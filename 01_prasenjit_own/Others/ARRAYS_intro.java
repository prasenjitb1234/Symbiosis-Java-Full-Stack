import java.util.Scanner;

public class ARRAYS_intro {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//
////        int[] marks = new int[3];
//        int marks[] = new int[3];
//        marks[0] = 80; // physics
//        marks[1] = 70; // chemistry
//        marks[2] = 90; // maths
//
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//
//        for (int i = 0 ; i< 3 ; i++){
//            System.out.println(marks[i]);
//        }

//**************_________****NEXT *****________________*******************

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];


        //input
        for (int i = 0; i< size; i++){
            numbers[i] = sc.nextInt();
        }

        // output
        for(int i = 0; i<size; i ++){
            System.out.println(numbers[i]);
        }



    }
}
