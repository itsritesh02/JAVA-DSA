
//--------------------Brute Force Approach--------------------

/*
    Approach: Brute Force (Range Sum Query)

    Algorithm:
    1. Initialize sum = 0.
    2. Traverse the array from index l to r.
    3. Add each element to sum.
    4. Return the final sum.

    Time Complexity: O(r - l + 1) ≈ O(n)
    -> We traverse all elements in the given range once.

    Space Complexity: O(1)
    -> Only one extra variable (sum) is used.
*/




// public class SumOfNQueries {
//   static int sumOfQueries(int arr[], int l, int r){
//     int sum=0;
// for(int i=l;i<=r;i++){
// sum+=arr[i];
// }
// return sum;
//   }
//   public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5};
//     int l=2;
//     int r=4;
//    int ans = sumOfQueries(arr, l, r);
//    System.out.println(ans);
//   }
// }



//---------------------

/*
    Approach: Prefix Sum (Optimal)

    Algorithm:
    1. Convert the original array into a Prefix Sum array.
    2. If l == 0, return prefix[r].
    3. Otherwise, return prefix[r] - prefix[l - 1].

    Time Complexity:
    -> Prefix Sum Creation: O(n)
    -> Each Query: O(1)

    Overall:
    - Single Query: O(n)
    - Multiple Queries: O(n + q)
      (where q = number of queries)

    Space Complexity:
    O(1)  -> If prefix sum is stored in the same array (in-place).
    O(n)  -> If a separate prefix array is created.
*/

public class SumOfNQueries {
 

  static int[] preSum(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      arr[i] += arr[i - 1];

    }
    return arr;
  }
  

static int nquery(int arr [], int l ,int r){
  if (l == 0) {
    return arr[r];
  }

  int ans = arr[r]-arr[l-1];
  return ans;
}



  
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int l = 2;
    int r = 4;
     preSum(arr);
int ans = nquery(arr, l, r);
    System.out.println(ans);
  }
}
