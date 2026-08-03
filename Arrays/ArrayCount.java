import java.util.Scanner;

public class ArrayCount {


static int countOccurences(int[]arr, int x){
  int count =0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
      count++;
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

    System.out.println("Enter x");
    int x = sc.nextInt();

    int ans =countOccurences(arr, x);
    System.out.println("Count of x :"+ans);
  }
}



//----------------------------------------------------------------------------------------------------------------------------------------------

/*
      Approach: Brute Force (Linear Search)
     
      Algorithm:
      1. Traverse the entire array.
      2. Compare each element with x.
      3. If element == x, increment count.
      4. Return count.
     
      Time Complexity: O(n)
      -> We traverse the array only once.
     
      Space Complexity: O(1)
      -> Only a few extra variables (count, i) are used.
     /


/*
import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class ArrayCount {
// Hindi: ArrayCount naam ki class banayi.
// English: Created a class named ArrayCount.

    static int countOccurences(int[] arr, int x) {
    // Hindi: countOccurences() function array aur x value lega.
    // English: The countOccurences() method takes an array and a value x.

        int count = 0;
        // Hindi: count ko 0 se initialize kiya.
        // English: Initialized count to 0.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Loop array ke har element ko check karega.
        // English: The loop checks every element of the array.

            if (arr[i] == x) {
            // Hindi: Check karo current element x ke equal hai ya nahi.
            // English: Check whether the current element is equal to x.

                count++;
                // Hindi: Agar equal hai to count ko 1 se badha do.
                // English: If it is equal, increase the count by 1.
            }
        }

        return count;
        // Hindi: x kitni baar aaya hai uska count return karo.
        // English: Return the total number of occurrences of x.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created a Scanner object.

        System.out.println("Enter Size of Array");
        // Hindi: User se array ka size maanga.
        // English: Ask the user to enter the array size.

        int n = sc.nextInt();
        // Hindi: Array ka size input liya.
        // English: Read the array size.

        int[] arr = new int[n];
        // Hindi: Array banaya.
        // English: Created an array.

        System.out.println("Enter Array Elements");
        // Hindi: User se array ke elements maange.
        // English: Ask the user to enter the array elements.

        for (int i = 0; i < n; i++) {
        // Hindi: Loop se array ke elements input kar rahe hain.
        // English: Read all array elements using a loop.

            arr[i] = sc.nextInt();
            // Hindi: Har element input kiya.
            // English: Read each element.
        }

        System.out.println("Enter x");
        // Hindi: User se x value maangi.
        // English: Ask the user to enter the value x.

        int x = sc.nextInt();
        // Hindi: x input liya.
        // English: Read the value x.

        int ans = countOccurences(arr, x);
        // Hindi: countOccurences() function call kiya.
        // English: Called the countOccurences() method.

        System.out.println("Count of x: " + ans);
        // Hindi: x kitni baar aaya hai wo print kiya.
        // English: Printed how many times x appears in the array.

        sc.close();
        // Hindi: Scanner ko close kar diya.
        // English: Closed the Scanner object.
    }
}
*/
