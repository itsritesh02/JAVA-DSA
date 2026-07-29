public class FirstRepeating {
static int firstRepeating(int [] nums){
  for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        return nums[i];
      }
    }
  }
  return -1;
}

  public static void main(String[] args) {
    int nums[] = {2, 1, 4, 3, 5 ,7 ,9,3};
    int ans = firstRepeating(nums);

    if(ans !=-1){
      System.out.println("First Reapeating is :"+ans);
    }
    else{
      System.out.println("no reapeat");
    }
  }
}

//-----------------------------------------------------------------------------------------------------------------


/*
public class FirstRepeating {
// Hindi: FirstRepeating naam ki class banayi.
// English: Created a class named FirstRepeating.

    static int firstRepeating(int[] nums) {
    // Hindi: firstRepeating() function array ka pehla repeating element return karega.
    // English: The firstRepeating() method returns the first repeating element in the array.

        for (int i = 0; i < nums.length; i++) {
        // Hindi: Outer loop har element ko ek-ek karke check karega.
        // English: The outer loop checks each element one by one.

            for (int j = i + 1; j < nums.length; j++) {
            // Hindi: Inner loop current element ke baad wale sab elements ko check karega.
            // English: The inner loop checks all elements after the current element.

                if (nums[i] == nums[j]) {
                // Hindi: Agar dono elements same hain to repeating element mil gaya.
                // English: If both elements are equal, a repeating element is found.

                    return nums[i];
                    // Hindi: Pehla repeating element return kar do.
                    // English: Return the first repeating element.
                }
            }
        }

        return -1;
        // Hindi: Agar koi repeating element nahi mila to -1 return karo.
        // English: Return -1 if no repeating element exists.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int nums[] = {2, 1, 4, 3, 5, 7, 9, 3};
        // Hindi: Input array.
        // English: Input array.

        int ans = firstRepeating(nums);
        // Hindi: firstRepeating() function call kiya.
        // English: Called the firstRepeating() method.

        if (ans != -1) {
        // Hindi: Agar answer -1 nahi hai to repeating element mila hai.
        // English: If the answer is not -1, a repeating element exists.

            System.out.println("First Repeating is : " + ans);
            // Hindi: First repeating element print kiya.
            // English: Printed the first repeating element.
        }

        else {
        // Hindi: Agar answer -1 hai to koi repeating element nahi mila.
        // English: If the answer is -1, no repeating element exists.

            System.out.println("No Repeat");
            // Hindi: No repeat message print kiya.
            // English: Printed the "No Repeat" message.
        }
    }
}

*/
