
import java.util.Scanner;

public class lastOccurence {

  static int lastOccurences(int[] arr, int x) {
    int lastIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        lastIndex = i;
      }
    }
    return lastIndex;
  }

  static int countOccurence(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
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

    int ans = countOccurence(arr, x);
    System.out.println("x:" + ans);

    int last = lastOccurences(arr, x);
    System.out.println("Last Occurence is :" + last);

  }
}


//---------------------------------------------------------------------------------------------------------------


/*
import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class lastOccurence {
// Hindi: lastOccurence naam ki class banayi.
// English: Created a class named lastOccurence.

    static int lastOccurences(int[] arr, int x) {
    // Hindi: lastOccurences() function x ka last index return karega.
    // English: The lastOccurences() method returns the last index of x.

        int lastIndex = -1;
        // Hindi: Agar x na mile to -1 return hoga.
        // English: Initialize lastIndex to -1 if x is not found.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Array ke har element ko check karenge.
        // English: Traverse every element of the array.

            if (arr[i] == x) {
            // Hindi: Agar current element x ke equal hai.
            // English: Check if the current element equals x.

                lastIndex = i;
                // Hindi: Current index ko lastIndex me store kar diya.
                // English: Store the current index in lastIndex.
            }
        }

        return lastIndex;
        // Hindi: Last occurrence ka index return karo.
        // English: Return the last occurrence index.
    }

    static int countOccurence(int[] arr, int x) {
    // Hindi: countOccurence() function x kitni baar aaya hai wo return karega.
    // English: The countOccurence() method returns how many times x appears.

        int count = 0;
        // Hindi: count ko 0 se initialize kiya.
        // English: Initialize count to 0.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Array ke har element ko check karenge.
        // English: Traverse every element of the array.

            if (arr[i] == x) {
            // Hindi: Agar current element x ke equal hai.
            // English: Check if the current element equals x.

                count++;
                // Hindi: Count ko 1 se increase kar diya.
                // English: Increment the count.
            }
        }

        return count;
        // Hindi: Total count return karo.
        // English: Return the total count.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created a Scanner object.

        System.out.println("Enter x");
        // Hindi: User se x value maangi.
        // English: Ask the user to enter x.

        int x = sc.nextInt();
        // Hindi: x input liya.
        // English: Read x.

        System.out.println("Enter Size of Array");
        // Hindi: Array ka size input liya.
        // English: Read the array size.

        int n = sc.nextInt();

        int[] arr = new int[n];
        // Hindi: n size ka array banaya.
        // English: Created an array of size n.

        System.out.println("Enter Array Elements");
        // Hindi: User se array ke elements maange.
        // English: Ask the user to enter array elements.

        for (int i = 0; i < n; i++) {
        // Hindi: Array me values store karenge.
        // English: Store values in the array.

            arr[i] = sc.nextInt();
            // Hindi: Har element input kiya.
            // English: Read each element.
        }

        int ans = countOccurence(arr, x);
        // Hindi: x kitni baar aaya hai uska count nikala.
        // English: Counted the number of occurrences of x.

        System.out.println("Count of x: " + ans);
        // Hindi: Count print kiya.
        // English: Printed the count.

        int last = lastOccurences(arr, x);
        // Hindi: x ka last occurrence nikala.
        // English: Found the last occurrence of x.

        System.out.println("Last Occurrence is: " + last);
        // Hindi: Last occurrence ka index print kiya.
        // English: Printed the last occurrence index.

        sc.close();
        // Hindi: Scanner ko close kiya.
        // English: Closed the Scanner object.
    }
}
*/