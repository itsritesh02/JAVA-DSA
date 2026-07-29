

public class sortedOrNot {

  static void SortedArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {

          System.out.println("Array is not sorted");
          return;
        }

      }
    }
    System.out.println("Array is sorted");
  }

  public static void main(String[] args) {

    int[] arr = { 2, 3, 4, 8, 9 };

    SortedArray(arr);

  }
}


//-------------------------------------------------------------------------------------------------------------------------------------------

/*
public class sortedOrNot {
// Hindi: sortedOrNot naam ki class banayi.
// English: Created a class named sortedOrNot.

    static void SortedArray(int arr[]) {
    // Hindi: Ye method check karega ki array sorted hai ya nahi.
    // English: This method checks whether the array is sorted or not.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Outer loop har element ko pick karega.
        // English: The outer loop picks each element.

            for (int j = i + 1; j < arr.length; j++) {
            // Hindi: Inner loop current element ke baad wale elements ko check karega.
            // English: The inner loop checks all elements after the current one.

                if (arr[i] > arr[j]) {
                // Hindi: Agar pehle wala element baad wale element se bada hai,
                // to array sorted nahi hai.
                // English: If the current element is greater than a later element,
                // the array is not sorted.

                    System.out.println("Array is not sorted");
                    // Hindi: Array sorted nahi hai, message print kiya.
                    // English: Printed that the array is not sorted.

                    return;
                    // Hindi: Program ko yahin stop kar diya.
                    // English: Stopped the method immediately.
                }
            }
        }

        System.out.println("Array is sorted");
        // Hindi: Agar kahin bhi galat order nahi mila to array sorted hai.
        // English: If no incorrect order is found, the array is sorted.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int[] arr = {2, 3, 4, 8, 9};
        // Hindi: Input array banaya.
        // English: Created the input array.

        SortedArray(arr);
        // Hindi: SortedArray() method call kiya.
        // English: Called the SortedArray() method.
    }
}
*/