import java.util.Scanner;

public class PrintArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Array ka size

    System.out.println("Enter Size of Array");
    int n = sc.nextInt();


    //create Array According to Size
    int[] arr = new int[n];

//Array input

System.out.println("Enter Array Elaments");
for(int i=0;i<n ;i++){
  arr[i]= sc.nextInt();
}


//Array Print

System.out.println("Array Elements Are");


for(int i=0;i<n;i++){
  System.out.print(arr[i]+" ");
}

  }
}



//-----------------------------------------------------------------------------------------------------------

/*
import java.util.Scanner;
// Hindi: Scanner class import ki hai taki user se input le saken.
// English: Imported the Scanner class to take input from the user.

public class PrintArray {
// Hindi: PrintArray naam ki class banayi.
// English: Created a class named PrintArray.

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        Scanner sc = new Scanner(System.in);
        // Hindi: Scanner object banaya.
        // English: Created a Scanner object.

        // Array ka size

        System.out.println("Enter Size of Array");
        // Hindi: User se array ka size maanga.
        // English: Asked the user to enter the array size.

        int n = sc.nextInt();
        // Hindi: Array ka size input liya.
        // English: Read the array size.

        // Create Array According to Size

        int[] arr = new int[n];
        // Hindi: n size ka integer array banaya.
        // English: Created an integer array of size n.

        // Array Input

        System.out.println("Enter Array Elements");
        // Hindi: User se array ke elements maange.
        // English: Asked the user to enter the array elements.

        for (int i = 0; i < n; i++) {
        // Hindi: Loop array ke har index par chalega.
        // English: The loop traverses every index of the array.

            arr[i] = sc.nextInt();
            // Hindi: Har element ko array me store kiya.
            // English: Stored each input element into the array.
        }

        // Array Print

        System.out.println("Array Elements Are");
        // Hindi: Array print karne se pehle message print kiya.
        // English: Printed a message before displaying the array.

        for (int i = 0; i < n; i++) {
        // Hindi: Loop array ke har element ko print karega.
        // English: The loop prints every element of the array.

            System.out.print(arr[i] + " ");
            // Hindi: Current element print kiya.
            // English: Printed the current element.
        }

        sc.close();
        // Hindi: Scanner ko close kar diya.
        // English: Closed the Scanner object.
    }
}
*/