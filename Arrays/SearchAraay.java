public class SearchAraay {

  void search() {

    int[] arr = { 23, 44, 55, 66, 577, 88, 99, 100, 111 };
    int x = 100;
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        ans = i;
        break;
      }

    }
    System.out.println("Index of " + x + " is: " + ans);
  }

  public static void main(String[] args) {
    SearchAraay obj = new SearchAraay();
    obj.search();
  }
}


//--------------------------------------------------------------------------------------------------------------------

/*
public class SearchAraay {
// Hindi: SearchAraay naam ki class banayi.
// English: Created a class named SearchAraay.

    void search() {
    // Hindi: search() method array me element ko search karega.
    // English: The search() method searches for an element in the array.

        int[] arr = {23, 44, 55, 66, 577, 88, 99, 100, 111};
        // Hindi: Integer array banaya aur values store ki.
        // English: Created an integer array and stored values.

        int x = 100;
        // Hindi: Jis value ko search karna hai wo x me store ki.
        // English: Stored the value to be searched in x.

        int ans = -1;
        // Hindi: ans ko -1 se initialize kiya.
        // Agar element nahi mila to -1 hi print hoga.
        // English: Initialized ans to -1.
        // If the element is not found, -1 will be printed.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Loop array ke har element ko check karega.
        // English: The loop traverses every element of the array.

            if (arr[i] == x) {
            // Hindi: Check karo current element x ke equal hai ya nahi.
            // English: Check whether the current element equals x.

                ans = i;
                // Hindi: Agar element mil gaya to uska index ans me store kar do.
                // English: If found, store its index in ans.

                break;
                // Hindi: Element mil gaya, isliye loop turant stop kar do.
                // English: Stop the loop immediately after finding the element.
            }
        }

        System.out.println("Index of " + x + " is: " + ans);
        // Hindi: x ka index print kiya.
        // English: Printed the index of x.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        SearchAraay obj = new SearchAraay();
        // Hindi: Class ka object banaya.
        // English: Created an object of the class.

        obj.search();
        // Hindi: search() method call kiya.
        // English: Called the search() method.
    }
}
*/