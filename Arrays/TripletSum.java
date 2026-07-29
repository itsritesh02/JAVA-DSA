import java.util.Scanner;

public class TripletSum {
  static int sum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            System.out.println("Indices are: " + i + " , " + j + " , " + k);
            count++;
          }
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
    int total = sum(arr, Target);
    System.out.println("total triplets are :" + total);
  }
}



//----------------------------------------------------------------------------------------

/*

import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class TripletSum {
// Hindi: TripletSum naam ki class banayi.
// English: Created a class named TripletSum.

    static int sum(int[] arr, int target) {
    // Hindi: Ye method 3 elements ka sum check karega jo target ke equal ho.
    // English: This method checks three elements whose sum equals the target.

        int count = 0;
        // Hindi: Triplets count karne ke liye count variable banaya.
        // English: Created count variable to store number of triplets.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Pehla element choose karne ke liye loop.
        // English: Loop to choose the first element.

            for (int j = i + 1; j < arr.length; j++) {
            // Hindi: Dusra element choose karne ke liye loop.
            // English: Loop to choose the second element.

                for (int k = j + 1; k < arr.length; k++) {
                // Hindi: Teesra element choose karne ke liye loop.
                // English: Loop to choose the third element.

                    if (arr[i] + arr[j] + arr[k] == target) {
                    // Hindi: Check karte hain ki teen elements ka sum target ke equal hai ya nahi.
                    // English: Checks whether the sum of three elements equals the target.

                        System.out.println("Indices are: " + i + " , " + j + " , " + k);
                        // Hindi: Triplet ke indices print kiye.
                        // English: Printed the indices of the triplet.

                        count++;
                        // Hindi: Triplet mil gaya, count badha diya.
                        // English: Triplet found, incremented count.
                    }
                }
            }
        }

        return count;
        // Hindi: Total triplets return kiye.
        // English: Returned total number of triplets.
    }


    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from main method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created Scanner object.

        // Array ka size

        System.out.println("Enter Size of Array");
        // Hindi: User se array size maanga.
        // English: Asked user for array size.

        int n = sc.nextInt();
        // Hindi: Array ka size input liya.
        // English: Read array size.


        // Create Array According to Size

        int[] arr = new int[n];
        // Hindi: n size ka array banaya.
        // English: Created an array of size n.


        // Array Input

        System.out.println("Enter Array Elements");
        // Hindi: Array elements input lene ke liye message.
        // English: Message for taking array elements.


        for (int i = 0; i < n; i++) {
        // Hindi: Loop ke through array me values store karenge.
        // English: Store values in array using loop.

            arr[i] = sc.nextInt();
            // Hindi: Har element input kiya.
            // English: Read each element.
        }


        System.out.println("Enter target");
        // Hindi: Target value maangi.
        // English: Asked for target value.

        int Target = sc.nextInt();
        // Hindi: Target input liya.
        // English: Read target value.


        int total = sum(arr, Target);
        // Hindi: Sum method call kiya.
        // English: Called sum method.


        System.out.println("Total triplets are: " + total);
        // Hindi: Total matching triplets print kiye.
        // English: Printed total matching triplets.
        
        sc.close();
        // Hindi: Scanner close kiya.
        // English: Closed Scanner.
    }
}*/


