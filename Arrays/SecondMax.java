public class SecondMax {

  static int findMax(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  static int findSecondMax(int[] num) {
    int max = findMax(num);

    for (int i = 0; i < num.length; i++) {
      if (num[i] == max) {
        num[i] = Integer.MIN_VALUE;
      }
    }
    int secondMax = findMax(num);
    return secondMax;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 8, 6, 9, 1, 3 };
    int ans = findMax(nums);
    System.out.println("Max is :" + ans);
    int ans2 = findSecondMax(nums);
    System.out.println("2nd Max is :" + ans2);
  }
}


//----------------------------------------------------------------------------------------------------------------


/*
public class SecondMax {
// Hindi: SecondMax naam ki class banayi.
// English: Created a class named SecondMax.

    static int findMax(int[] nums) {
    // Hindi: Ye method array ka maximum element return karega.
    // English: This method returns the maximum element of the array.

        int max = Integer.MIN_VALUE;
        // Hindi: max ko sabse chhoti integer value se initialize kiya.
        // English: Initialized max with the smallest possible integer value.

        for (int i = 0; i < nums.length; i++) {
        // Hindi: Array ke har element ko check karenge.
        // English: Traverse every element of the array.

            if (nums[i] > max) {
            // Hindi: Agar current element max se bada hai.
            // English: If the current element is greater than max.

                max = nums[i];
                // Hindi: max ko update kar do.
                // English: Update max.
            }
        }

        return max;
        // Hindi: Maximum element return karo.
        // English: Return the maximum element.
    }

    static int findSecondMax(int[] num) {
    // Hindi: Ye method second maximum element return karega.
    // English: This method returns the second maximum element.

        int max = findMax(num);
        // Hindi: Pehle maximum element nikala.
        // English: First, find the maximum element.

        for (int i = 0; i < num.length; i++) {
        // Hindi: Array dobara traverse karenge.
        // English: Traverse the array again.

            if (num[i] == max) {
            // Hindi: Agar current element maximum ke equal hai.
            // English: If the current element equals the maximum.

                num[i] = Integer.MIN_VALUE;
                // Hindi: Maximum value ko sabse chhoti value se replace kar diya.
                // English: Replace the maximum value with the smallest integer value.
            }
        }

        int secondMax = findMax(num);
        // Hindi: Ab bache hue array ka maximum hi second maximum hoga.
        // English: Now the maximum of the modified array is the second maximum.

        return secondMax;
        // Hindi: Second maximum return karo.
        // English: Return the second maximum element.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int nums[] = {2, 8, 6, 9, 1, 3};
        // Hindi: Input array.
        // English: Input array.

        int ans = findMax(nums);
        // Hindi: Maximum element find kiya.
        // English: Found the maximum element.

        System.out.println("Max is : " + ans);
        // Hindi: Maximum element print kiya.
        // English: Printed the maximum element.

        int ans2 = findSecondMax(nums);
        // Hindi: Second maximum element find kiya.
        // English: Found the second maximum element.

        System.out.println("2nd Max is : " + ans2);
        // Hindi: Second maximum print kiya.
        // English: Printed the second maximum element.
    }
}
*/