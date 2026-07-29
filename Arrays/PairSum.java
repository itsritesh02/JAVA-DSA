import java.util.Scanner;

public class PairSum {

  static int sum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("Indices are: " + i + " , " + j);
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Array ka size

    System.out.println("Enter Size of Array");
    int n = sc.nextInt();

    // create Array According to Size
    int[] arr = new int[n];

    // Array input

    System.out.println("Enter Array Elaments");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter target");
    int Target = sc.nextInt();


    
int total=sum(arr, Target);
    System.out.println("total pairs are :"+total);
  }
}


//----------------------------------------------------------------------------------------------------------------------


/*

import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class PairSum {
// Hindi: PairSum naam ki class banayi.
// English: Created a class named PairSum.

    static int sum(int[] arr, int target) {
    // Hindi: sum() function array aur target lega aur
    // target ke equal sum wale pairs count karega.
    // English: The sum() method takes an array and a target,
    // then counts pairs whose sum equals the target.

        int count = 0;
        // Hindi: Pair count ko 0 se initialize kiya.
        // English: Initialized pair count to 0.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Outer loop har element ko pick karega.
        // English: The outer loop picks each element.

            for (int j = i + 1; j < arr.length; j++) {
            // Hindi: Inner loop current element ke baad wale elements ko check karega.
            // English: The inner loop checks all elements after the current element.

                if (arr[i] + arr[j] == target) {
                // Hindi: Agar dono elements ka sum target ke equal hai.
                // English: Check whether the sum of both elements equals the target.

                    System.out.println("Indices are: " + i + " , " + j);
                    // Hindi: Pair ke indices print kiye.
                    // English: Printed the indices of the pair.

                    count++;
                    // Hindi: Pair mil gaya, count ko 1 se badha diya.
                    // English: Pair found, incremented the count.
                }
            }
        }

        return count;
        // Hindi: Total pairs return kiye.
        // English: Returned the total number of pairs.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created a Scanner object.

        System.out.println("Enter Size of Array");
        // Hindi: User se array ka size maanga.
        // English: Asked the user to enter the array size.

        int n = sc.nextInt();
        // Hindi: Array ka size input liya.
        // English: Read the array size.

        int[] arr = new int[n];
        // Hindi: n size ka array banaya.
        // English: Created an array of size n.

        System.out.println("Enter Array Elements");
        // Hindi: User se array ke elements maange.
        // English: Asked the user to enter the array elements.

        for (int i = 0; i < n; i++) {
        // Hindi: Loop ke through array me values store karenge.
        // English: Stored array elements using a loop.

            arr[i] = sc.nextInt();
            // Hindi: Har element input kiya.
            // English: Read each array element.
        }

        System.out.println("Enter Target");
        // Hindi: User se target value maangi.
        // English: Asked the user to enter the target value.

        int target = sc.nextInt();
        // Hindi: Target input liya.
        // English: Read the target value.

        int total = sum(arr, target);
        // Hindi: sum() function call kiya.
        // English: Called the sum() method.

        System.out.println("Total Pairs are: " + total);
        // Hindi: Total matching pairs print kiye.
        // English: Printed the total number of matching pairs.

        
    }
}
*/