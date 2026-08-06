public class EqualSumPartition {

  
  static int ArraySum(int [] arr){
    int totalSum =0;
    for(int i=0;i<arr.length;i++){
      totalSum+= arr[i];
    }
    return totalSum;
  }

static boolean equalSumPartition(int [] arr){
  int totalSum = ArraySum(arr);
  int PrefixSum = 0;

  for(int i=0; i<arr.length;i++){
    PrefixSum+=arr[i];
    int suffix = totalSum-PrefixSum;
    if(suffix==PrefixSum){
      return true;
    }
    
  }
return false;

}

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1,2,3 };
  
    System.out.println("Equal Partition: "+equalSumPartition(arr));
    
  }
}


/*
Approach: Optimal (Prefix Sum)

- Calculate the total sum of the array.
- Traverse the array while maintaining the prefix sum.
- Calculate the suffix sum using:
      suffixSum = totalSum - prefixSum
- If prefix sum becomes equal to suffix sum, return true.
- Otherwise, return false.
*/

/*
Algorithm:
1. Find the total sum of the array.
2. Initialize prefixSum = 0.
3. Traverse the array.
4. Add the current element to prefixSum.
5. Calculate suffixSum = totalSum - prefixSum.
6. If prefixSum == suffixSum, return true.
7. If no partition is found, return false.
*/

/*
Time Complexity: O(n)
- One traversal to calculate total sum.
- One traversal to check partition.

Space Complexity: O(1)
- No extra space is used.
*/



/*
public class EqualSumPartition {

    // Calculate the total sum of the array
    // Array ka total sum calculate karo
    static int ArraySum(int[] arr) {

        int totalSum = 0;

        // Traverse the array and calculate total sum
        // Array traverse karke total sum nikalo
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Return the total sum
        // Total sum return karo
        return totalSum;
    }

    // Check whether equal sum partition exists
    // Check karo ki equal sum partition possible hai ya nahi
    static boolean equalSumPartition(int[] arr) {

        // Calculate the total sum of the array
        // Array ka total sum nikalo
        int totalSum = ArraySum(arr);

        // Store the prefix sum
        // Prefix sum store karega
        int prefixSum = 0;

        // Traverse the array
        // Puri array traverse karo
        for (int i = 0; i < arr.length; i++) {

            // Update the prefix sum
            // Prefix sum me current element add karo
            prefixSum += arr[i];

            // Calculate the suffix sum
            // Suffix sum calculate karo
            int suffixSum = totalSum - prefixSum;

            // Check if both sums are equal
            // Agar prefix aur suffix sum equal hain to partition mil gaya
            if (prefixSum == suffixSum) {
                return true;
            }
        }

        // No equal partition found
        // Equal partition nahi mila
        return false;
    }

    public static void main(String[] args) {

        // Input array
        // Input array
        int[] arr = {1, 2, 3, 1, 2, 3};

        // Print the result
        // Result print karo
        System.out.println("Equal Partition: " + equalSumPartition(arr));
    }
} */