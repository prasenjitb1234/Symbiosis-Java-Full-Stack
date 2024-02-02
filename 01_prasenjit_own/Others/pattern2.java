import java.util.Scanner;
public class pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//       pattern 1
//
//        int n = 4;
//        int m = 5;
//
////        for(int i = 1; i<=n; i++){
////            for (int j = 1; j<m;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////
////        }
//*******************************************************************

//        pattern 2

//        int n = 4 ;
//        int m = 5 ;
//
////        outer loop
//        for (int i = 1 ; i<=n ; i++){
//            // inner loop
//            for (int j=1;j<=m;j++){
//                // cell -> (i,j)
//                if(i ==1 || j ==1 || i == n || j ==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

// ****       **************************************************

//        pattern 3   pyramid half
//
//        int n = 4 ;
//
//        for(int i = 1; i<= n ; i++){
//            for(int j = 1 ; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//************************************************************

//        pattern 4
//
//        int n = 4 ;
//
//        for(int i = n ; i >= 1; i--){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//****************************************************************

//        pattern 5
//
//        int n = 4;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        ******************************************

//        pattern 6 - numbered half pyramid
//
//        int n = 5;
//
//        for(int i = 1; i<=n ; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//**************************************

//        pattern 7
//
//        int n = 5;
//
//        for(int i = n; i>=1;i--){
//            for(int j= 1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        *****************************

//        pattern 8 - floyd's pyramid
//
//        int n = 5;
//        int number = 1;
//
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(number);
//                number++;
//            }
//            System.out.println();
//        }

//        **************************

//        pattern 9 -   0-1 triangle

        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j = 1 ; j<=i;j++){
                int sum = i+j;
                if (sum%2==0){   // even
                    System.out.print("1");
                }else{  // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }







    }
}
