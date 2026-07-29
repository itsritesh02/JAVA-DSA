
public class reverse {

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  static void SwapInArrray(int []arr, int i, int j){
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
  }




  static void reverseArr(int arr[]) {
    int n = arr.length;
  
    int i=0;
    int j=n-1;
    while(i<j){
SwapInArrray(arr, i, j);

i++;
j--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    System.out.print("Oiginal Array: ");
    print(arr);
     reverseArr(arr);
     System.out.print("Reversd Array: ");
    print(arr);

  }
}


//----------------------------------------------------------------------------------------------------------


/*
public class reverse {
// Hindi: reverse naam ki class banayi.
// English: Created a class named reverse.

    static void print(int[] arr) {
    // Hindi: print() method array ke elements print karega.
    // English: The print() method prints all array elements.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Loop array ke har element par chalega.
        // English: The loop traverses every element of the array.

            System.out.print(arr[i] + " ");
            // Hindi: Current element print kiya.
            // English: Printed the current element.
        }

        System.out.println();
        // Hindi: Next line me jane ke liye.
        // English: Move the cursor to the next line.
    }

    static void SwapInArrray(int[] arr, int i, int j) {
    // Hindi: Ye method array ke do elements ko swap karega.
    // English: This method swaps two elements of the array.

        int temp = arr[i];
        // Hindi: Pehle element ko temporary variable me store kiya.
        // English: Stored the first element in a temporary variable.

        arr[i] = arr[j];
        // Hindi: Dusre element ko pehli position par rakh diya.
        // English: Placed the second element at the first position.

        arr[j] = temp;
        // Hindi: Temporary value ko dusri position par rakh diya.
        // English: Placed the temporary value at the second position.
    }

    static void reverseArr(int arr[]) {
    // Hindi: Ye method array ko reverse karega.
    // English: This method reverses the array.

        int n = arr.length;
        // Hindi: Array ki length store ki.
        // English: Stored the length of the array.

        int i = 0;
        // Hindi: i first index ko point karega.
        // English: i points to the first index.

        int j = n - 1;
        // Hindi: j last index ko point karega.
        // English: j points to the last index.

        while (i < j) {
        // Hindi: Jab tak i aur j cross nahi karte tab tak loop chalega.
        // English: Continue until i and j cross each other.

            SwapInArrray(arr, i, j);
            // Hindi: First aur last element ko swap kiya.
            // English: Swapped the first and last elements.

            i++;
            // Hindi: i ko ek step aage badhaya.
            // English: Moved i one step forward.

            j--;
            // Hindi: j ko ek step peeche kiya.
            // English: Moved j one step backward.
        }
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int arr[] = {1, 2, 3, 4, 5};
        // Hindi: Input array banaya.
        // English: Created the input array.

        System.out.print("Original Array: ");
        // Hindi: Original array ka message print kiya.
        // English: Printed the original array message.

        print(arr);
        // Hindi: Original array print kiya.
        // English: Printed the original array.

        reverseArr(arr);
        // Hindi: Array ko reverse kiya.
        // English: Reversed the array.

        System.out.print("Reversed Array: ");
        // Hindi: Reverse array ka message print kiya.
        // English: Printed the reversed array message.

        print(arr);
        // Hindi: Reverse array print kiya.
        // English: Printed the reversed array.
    }
}

*/