public class maxElement {

  void ArrayMaxElement() {
    int[] arr = { 23, 44, 55, 66, 577, 88, 99, 100, 111 };
    int max = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }

    }
    System.out.println("Max Element in Array is: " + max);
  }

  public static void main(String[] args) {
    maxElement obj = new maxElement();
    obj.ArrayMaxElement();
  }
}


//--------------------------------------------------------------------------------------------

/*
public class maxElement {
// Hindi: maxElement naam ki class banayi.
// English: Created a class named maxElement.

    void ArrayMaxElement() {
    // Hindi: Ye method array ka sabse bada element (maximum element) find karega.
    // English: This method finds the maximum element in the array.

        int[] arr = {23, 44, 55, 66, 577, 88, 99, 100, 111};
        // Hindi: Integer array banaya aur values store ki.
        // English: Created an integer array and stored values.

        int max = -1;
        // Hindi: max variable ko -1 se initialize kiya.
        // English: Initialized the max variable with -1.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Loop array ke har element ko check karega.
        // English: The loop traverses every element of the array.

            if (arr[i] > max) {
            // Hindi: Agar current element max se bada hai,
            // to max ko update karo.
            // English: If the current element is greater than max,
            // update max.

                max = arr[i];
                // Hindi: Naya maximum element store kar diya.
                // English: Stored the new maximum element.
            }
        }

        System.out.println("Max Element in Array is: " + max);
        // Hindi: Maximum element print kiya.
        // English: Printed the maximum element.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        maxElement obj = new maxElement();
        // Hindi: Class ka object banaya.
        // English: Created an object of the class.

        obj.ArrayMaxElement();
        // Hindi: ArrayMaxElement() method call kiya.
        // English: Called the ArrayMaxElement() method.
    }
}
*/