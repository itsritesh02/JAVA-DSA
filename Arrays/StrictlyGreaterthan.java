

import java.util.Scanner;

public class StrictlyGreaterthan {

  static int StrictlyGT(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x");
    int x = sc.nextInt();

    // Array ka size
    System.out.println("Enter Sizeof Array");
    int n = sc.nextInt();

    // Array create
    int[] arr = new int[n];

    System.out.println("Enter Array Elements");

    // Array input
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int ans = StrictlyGT(arr, x);
    System.out.println("x:" + ans);


    sc.close();

  }
}


//-------------------------------------------------------------------------------------------------------

/*

import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class StrictlyGreaterthan {
// Hindi: StrictlyGreaterthan naam ki class banayi.
// English: Created a class named StrictlyGreaterthan.

    static int StrictlyGT(int[] arr, int x) {
    // Hindi: Ye method count karega ki kitne elements x se bade hain.
    // English: This method counts how many elements are greater than x.

        int count = 0;
        // Hindi: Count ko 0 se initialize kiya.
        // English: Initialized count to 0.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Array ke har element ko check karenge.
        // English: Traverse every element of the array.

            if (arr[i] > x) {
            // Hindi: Agar current element x se bada hai.
            // English: If the current element is greater than x.

                count++;
                // Hindi: Count ko 1 se badha diya.
                // English: Incremented the count.
            }
        }

        return count;
        // Hindi: Total count return kiya.
        // English: Returned the total count.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created a Scanner object.

        System.out.println("Enter x");
        // Hindi: User se x ki value maangi.
        // English: Asked the user to enter x.

        int x = sc.nextInt();
        // Hindi: x input liya.
        // English: Read the value of x.

        // Array ka size

        System.out.println("Enter Size of Array");
        // Hindi: User se array ka size maanga.
        // English: Asked the user to enter the array size.

        int n = sc.nextInt();
        // Hindi: Array ka size input liya.
        // English: Read the array size.

        // Array create

        int[] arr = new int[n];
        // Hindi: n size ka array banaya.
        // English: Created an array of size n.

        System.out.println("Enter Array Elements");
        // Hindi: User se array ke elements maange.
        // English: Asked the user to enter the array elements.

        // Array input

        for (int i = 0; i < n; i++) {
        // Hindi: Loop ke through array me values store karenge.
        // English: Stored elements in the array using a loop.

            arr[i] = sc.nextInt();
            // Hindi: Har element input kiya.
            // English: Read each array element.
        }

        int ans = StrictlyGT(arr, x);
        // Hindi: StrictlyGT() method call kiya.
        // English: Called the StrictlyGT() method.

        System.out.println("Count = " + ans);
        // Hindi: x se bade elements ki total count print ki.
        // English: Printed the total number of elements greater than x.

       
    }
}
*/