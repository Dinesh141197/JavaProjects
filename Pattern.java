import java.util.Arrays;

public class Pattern {
    public static void main(String[] args){
//       1. Print these pattern
//            *
//            * *
//            * * *
//            * * * *

//     int n=4;
//
//     for(int i =2; 5<=4 ; i++ ){
//         for (int j =3; 3<=2; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//         2. Print these pattern
//         * * * *
//         * * *
//         * *
//         *

//        int n=4;
//
//        for(int i=1; i<=n; i++) { // 1<4 true
//            for (int j = 4; j>=i; j--){ // 3<=1 true // ****
//
//                System.out.print("*");
//        }
//            System.out.println();
//        }

//      3. Print these pattern
//      *
//      * *
//      * * *
//      * * * *
//      * * *
//      * *
//      *

//        int i,j;
//
//        for(i=1; i<=4; i++) {
//            for (j = 1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//        for (i = 1; i <= 4; i++) {
//            for (j = 3; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//


//         4. Print these pattern
//                 *
//               * *
//             * * *
//           * * * *

//        int i,j,k;
//
//        for(i=1; i<=4; i++)
//        {
//            for (j=1; j<=i;j++)
//            {
//                System.out.print(" ");
//            }
//           for (k=4;k>=i;k--)
//           {
//               System.out.print("*");
//           }
//            System.out.println();
//        }
//

//        5.Print these pattern ( Solid Rectangle)
//                * * * * *
//                * * * * *
//                * * * * *
//                * * * * *
//    int i,j;
//
//    for (i=1;i<=5;i++){
//        for(j=1; j<=5;j++){
//        System.out.print("*");
//    }
//        System.out.println("");
//    }

//       6. Print these pattern ( Hollow Rectangle)

//        * * * * *
//        *       *
//        *       *
//        * * * * *

//        int n =4;
//        int m =5;
//
//        for (int i=1;i<=n;i++){
//            for(int j=1; j<=m;j++){
//                if(i ==1 || j ==1 || i == n || j==m){
//                    System.out.print("* ");
//                }
//                else System.out.print("  ");
//
//            }
//            System.out.println();
//        }


//        7. Print these pattern
//      1
//      1 2
//      1 2 3
//      1 2 3 4

//       int n =4;

//       for (int i = 1; i<=n; i++){
//           for(int j=1; j<=i; j++){
//               System.out.print(j+" ");
//           }
//           System.out.println();
//       }


//      8. Print these pattern

//        12345
//        1234
//        123
//        12
//        1

//        int n =5;
//
//       for (int i = 1; i<=n; i++){
//
//           for(int j=1; j<=n-i+1; j++){
//               System.out.print(j+" ");
//           }
//           System.out.println();
//       }

//       9.Print these pattern
//
//        1
//        2 3
//        3 4 5
//        6 7 8 9
//        10 11 12 13

//        int n =5;
//        int number =1;
//
//        for (int i =1 ; i<=n; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//        }
//            System.out.println();
//        }

//        10. Print these pattern

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//        int n =5;
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }


// 11. Butterfly
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *

//        int n=4;
//         // upper half
//     for(int i =1; i<=n ; i++ ){
//         // 1st part
//         for (int j =1; j<=i; j++){
//             System.out.print("*");
//         }
//         // spaces
//         int space = 2*(n-i);
//         for (int j=1; j<=space; j++){
//             System.out.print(" ");
//         }
//
//         // 2nd part
//         for (int j =1; j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//         // lower half
//        for(int i=n; i>=1 ; i-- ){
//            // 1st part
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//                }
//               // spaces
//               int space = 2*(n-i);
//                for (int j=1; j<=space; j++){
//                    System.out.print(" ");
//                }
//
//            // 2nd part
//            for (int j =1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 12. print these pattern
//           * * * * *
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *

//        int n=5;
//
//
//        for(int i =1; i<=n;i++){
//         // spaces
//         for (int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         // stars
//         for(int j=1; j<=5; j++){
//             System.out.print("* ");
//         }
//            System.out.println();
//        }

        //13. Print these pattern
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5


//        int n=5;
//
//        // spaces
//        for(int i=1; i<=n;i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        // Print these pattern

//          1
//         212
//        32123
//       4321234
//      543212345


//        int n =5;
//
//        for (int i =1; i<=n;i++){
//         //spaces
//            for(int j =1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            // first half
//            for (int j=i; j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
    }
}
