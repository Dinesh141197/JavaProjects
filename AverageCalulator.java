import java.util.*;
public class AverageCalulator {

    // Print the factorial only positive numbers

//    public static void printFactorial (int n){
//
//        if(n<0){
//            System.out.println("Invalid Number");
//            return;
//        }
//        int Factorial =1;
//        // loop
//        for (int i=n; i >=1; i--){
//            Factorial = Factorial*i;
//
//        }
//        System.out.println(Factorial);
//        }
//
//        public static void main(String args[]){
//           Scanner sc = new Scanner (System.in);
//           int n = sc.nextInt();
//           printFactorial(n);
//        }


    //Write a function to calculate the product of 2 numbers.

//      public static int calculateproduct(int a, int b){
//
//          return a*b;
//      }
//      public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//
//          System.out.println(calculateproduct(a,b));
//    }


    // 1.Enter 3 numbers from the user & make a function to print their average.


//    public static void main(String[] args) {
//
//        calculateAverage();
//    }
//    public static void calculateAverage(){
//
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextInt();
//        double b = sc.nextInt();
//        double c = sc.nextInt();
//
//        double sum = (a + b + c)/3;
//        System.out.println(sum );
//
//    }

    // Write a function to print the sum of all odd numbers from 1 to n.

//    public static void calculateOddNumbers(int n){
//
//        for (int i =1; i<=n; i++){
//            if (i%2!=0){
//                System.out.print(i+" ");
//            }
//
//        }
//
//    }
//     public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        calculateOddNumbers(n);
//     }
//

    // Write a function which takes in 2 numbers and returns the greater of those two.

//    public static void printGreatestNumber(int a, int b){
//
//        if (a > b) {
//            System.out.println(a);
//        }
//        else{
//            System.out.println(b);
//        }
//    }
//      public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        printGreatestNumber(a,b);
//      }

    //  Write a function that takes in the radius as input and returns the circumference of a circle.


    //  Write a function that takes in age as input and returns if that person is eligible to vote or not.
    //  A person of age > 18 is eligible to vote

//    public static void checkingAge(int Age){
//     if(Age>=18){
//         System.out.println("you are eligible to Vote");
//     }
//     else System.out.println("you are not eligible to Vote");
//
//    }
//
//    public static void main (String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int Age = sc.nextInt();
//
//        checkingAge(Age);
//
//    }

    // Write an infinite loop using do while condition.

    //   public static void main (String args[]){
//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        }while (n>=1);
//
//    }

//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers [] = new int[size];
//
//        // inner loop
//        for (int i = 0; i<size; i++){
//            numbers[i] = sc.nextInt();
//    }
//        // outer loop
//        for (int i =0; i<size;i++){
//            System.out.println(numbers[i]);
//        }

    // Take an array as input fron the user. Search for a given number x and print the index at which it occurs.

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // inner loop
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // outer loop

        for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == x)
            System.out.println(i);
        }
    }
}












