// No pair should be their

import java.util.Scanner;

public class UniqueValue {
  static void unique(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;

        }
      }
     
      if(count==1){
        System.out.print(arr[i]+" ");
      }
    }
   
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

unique(arr);

  }
}



// ----------------------------------------------------------------------------------------------------------

/*
import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class UniqueValue {
// Hindi: UniqueValue naam ki class banayi.
// English: Created a class named UniqueValue.

    static void unique(int[] arr) {
    // Hindi: Ye method array ke unique elements print karega.
    // English: This method prints the unique elements of the array.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Har element ko ek-ek karke check karenge.
        // English: Traverse each element one by one.

            int count = 0;
            // Hindi: Current element kitni baar aaya hai uska count rakhega.
            // English: Stores how many times the current element appears.

            for (int j = 0; j < arr.length; j++) {
            // Hindi: Pura array dobara traverse karenge occurrence count karne ke liye.
            // English: Traverse the complete array again to count occurrences.

                if (arr[i] == arr[j]) {
                // Hindi: Agar dono elements same hain.
                // English: If both elements are equal.

                    count++;
                    // Hindi: Count ko increase kar diya.
                    // English: Incremented the count.
                }
            }


            if (count == 1) {
            // Hindi: Agar element sirf ek baar aaya hai to unique hai.
            // English: If element appears only once, it is unique.

                System.out.print(arr[i] + " ");
                // Hindi: Unique element print kiya.
                // English: Printed the unique element.
            }
        }
    }


    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main method.


        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created Scanner object.


        // Array ka size

        System.out.println("Enter Size of Array");
        // Hindi: Array ka size input lene ka message.
        // English: Asked user for array size.


        int n = sc.nextInt();
        // Hindi: Array size input liya.
        // English: Read array size.


        // Create Array According to Size

        int[] arr = new int[n];
        // Hindi: n size ka array banaya.
        // English: Created an array of size n.


        // Array input

        System.out.println("Enter Array Elements");
        // Hindi: Array elements input lene ka message.
        // English: Asked user to enter array elements.


        for (int i = 0; i < n; i++) {
        // Hindi: Loop ke through array values store karenge.
        // English: Store array values using a loop.

            arr[i] = sc.nextInt();
            // Hindi: Element input karke array me store kiya.
            // English: Read and store the element in array.
        }


        unique(arr);
        // Hindi: Unique method call kiya.
        // English: Called the unique method.


        sc.close();
        // Hindi: Scanner close kar diya.
        // English: Closed the Scanner.
    }
}

*/