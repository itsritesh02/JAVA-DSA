public class rotateArray {

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


static int[] rotate(int[] arr, int k) {
  int n =arr.length;
  k=k%n;
  int []ans = new int[n];
  int j=0;
  for(int i=n-k; i<n;i++){
ans[j]=arr[i];
j++;
  }

  for(int i=0 ; i<n-k;i++){
ans[j]=arr[i];
j++;
}
  return ans;
}

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 , 6, 7};
//                0  1 |2  3  4  5  6
//                  ^          ^
//                  |          |
//     arr[0 to n-k-1] |  arr[n-k to n-1]  
int k = 3;
System.out.print("Original Array: ");
print(arr);
int []ans=rotate(arr, k);
System.out.print("Array after rotation: ");
print(ans);

  }
}


// ----------------------------------------------------------------------------------------------------------------

/*
public class rotateArray {
// Hindi: rotateArray naam ki class banayi.
// English: Created a class named rotateArray.

    static void print(int[] arr) {
    // Hindi: print() function array ke elements print karega.
    // English: The print() method prints all elements of the array.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Loop array ke har element par chalega.
        // English: The loop iterates through every element of the array.

            System.out.print(arr[i] + " ");
            // Hindi: Current element print kiya.
            // English: Printed the current element.
        }

        System.out.println();
        // Hindi: Next line me chala gaya.
        // English: Moved the cursor to the next line.
    }

    static int[] rotate(int[] arr, int k) {
    // Hindi: rotate() function array ko right side me k positions rotate karega.
    // English: The rotate() method rotates the array to the right by k positions.

        int n = arr.length;
        // Hindi: Array ki length n me store ki.
        // English: Stored the length of the array in n.

        k = k % n;
        // Hindi: Agar k array ki length se bada ho,
        // to remainder lete hain.
        // English: If k is greater than the array length,
        // use the remainder to get the effective rotations.

        int[] ans = new int[n];
        // Hindi: Rotated array store karne ke liye naya array banaya.
        // English: Created a new array to store the rotated result.

        int j = 0;
        // Hindi: ans array ka index.
        // English: Index for the new array.

        for (int i = n - k; i < n; i++) {
        // Hindi: Last k elements ko pehle copy karenge.
        // English: Copy the last k elements first.

            ans[j] = arr[i];
            // Hindi: Last wale element ko ans me store kiya.
            // English: Copied the current element into ans.

            j++;
            // Hindi: Agle index par chale gaye.
            // English: Move to the next index.
        }

        for (int i = 0; i < n - k; i++) {
        // Hindi: Ab bache hue starting ke elements copy karenge.
        // English: Copy the remaining elements from the beginning.

            ans[j] = arr[i];
            // Hindi: Current element ko ans me store kiya.
            // English: Copied the current element into ans.

            j++;
            // Hindi: Agle index par chale gaye.
            // English: Move to the next index.
        }

        return ans;
        // Hindi: Rotated array return kiya.
        // English: Returned the rotated array.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        // Hindi: Input array.
        // English: Input array.

        int k = 3;
        // Hindi: Array ko 3 positions rotate karna hai.
        // English: Rotate the array by 3 positions.

        System.out.print("Original Array: ");
        // Hindi: Original array print karne ka message.
        // English: Print the message for the original array.

        print(arr);
        // Hindi: Original array print kiya.
        // English: Printed the original array.

        int[] ans = rotate(arr, k);
        // Hindi: rotate() function call kiya.
        // English: Called the rotate() method.

        System.out.print("Array after rotation: ");
        // Hindi: Rotated array print karne ka message.
        // English: Print the message for the rotated array.

        print(ans);
        // Hindi: Rotated array print kiya.
        // English: Printed the rotated array.
    }
}
*/