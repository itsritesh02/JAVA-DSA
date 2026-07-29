

public class smallestLargest {

  static void SmallestLargest(int arr[]) {
    int largest = arr[0];
    int smallest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {

        largest = arr[i];
      }
      if (arr[i] < smallest) {

        smallest = arr[i];
      }
    }

    System.out.println("Largest = " + largest);
    System.out.println("Smallest = " + smallest);
  }

  public static void main(String[] args) {

    int[] arr = { 2, 1, 7, 8, 9 };

    SmallestLargest(arr);

  }
}


//------------------------------------------------------------------------------------------------------------


/*
public class smallestLargest {
// Hindi: smallestLargest naam ki class banayi.
// English: Created a class named smallestLargest.

    static void SmallestLargest(int arr[]) {
    // Hindi: Ye method array ka smallest aur largest element find karega.
    // English: This method finds the smallest and largest elements in the array.

        int largest = arr[0];
        // Hindi: Largest ko pehle element se initialize kiya.
        // English: Initialized largest with the first element.

        int smallest = arr[0];
        // Hindi: Smallest ko bhi pehle element se initialize kiya.
        // English: Initialized smallest with the first element.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Array ke har element ko check karenge.
        // English: Traverse every element of the array.

            if (arr[i] > largest) {
            // Hindi: Agar current element largest se bada hai.
            // English: If the current element is greater than largest.

                largest = arr[i];
                // Hindi: Largest ko update kar diya.
                // English: Updated the largest value.
            }

            if (arr[i] < smallest) {
            // Hindi: Agar current element smallest se chhota hai.
            // English: If the current element is smaller than smallest.

                smallest = arr[i];
                // Hindi: Smallest ko update kar diya.
                // English: Updated the smallest value.
            }
        }

        System.out.println("Largest = " + largest);
        // Hindi: Largest element print kiya.
        // English: Printed the largest element.

        System.out.println("Smallest = " + smallest);
        // Hindi: Smallest element print kiya.
        // English: Printed the smallest element.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int[] arr = {2, 1, 7, 8, 9};
        // Hindi: Input array banaya.
        // English: Created the input array.

        SmallestLargest(arr);
        // Hindi: Method call kiya.
        // English: Called the SmallestLargest() method.
    }
}

*/