import java.util.Scanner;

public class patterns1 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);


        //  ____ WARNING -> dont uncomment all at once ____


        // pattern 1 solid rectangle

//        int n = 4;
//        int m = 5;
//
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ***************************************************

        // pattern 2  hollow rectangle

//        int n = 4;
//        int m = 5;
//
////        outer loop
//        for (int i = 1; i<=n;i++){
////            inner loop
//            for(int j=1;j<=m;j++){
//                // cell -> (i,j)
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        *************************************************
//            pattern 3  half pyramid

//        int n = 4;
//
////        outer loop
//        for (int i = 1; i<=n;i++){
////        inner loop
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        **********************************************
//            inverted half pyramid


//        int n = 4;
//
////        outer loop
//        for (int i = n; i>=1;i--){
////        inner loop
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//         **********************************************
//

//      pattern -   half pyramid of numbers

//        int n = 5;
//
//
//        for(int i = 1; i<=n;i++){
//            for(int j= 1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//

//        *****************************************
//          pattern - half pyramid increasing numbers

        int n = 5;
        int number = 1;


        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

























//        *x*x*x*x*x*x end brackets of total code *x*x*x*x*x*x
        //  *x*x*x*x*x*x end brackets of total code *x*x*x*x*x*x
    }
}
