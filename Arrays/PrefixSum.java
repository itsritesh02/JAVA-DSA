public class PrefixSum {
  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
  }

  static int[] Sum(int[] arr) {
    int n = arr.length;
    int ans[] = new int[n];
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j <= i; j++) {
        sum += arr[j];

        ans[i] = sum;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    printArr(arr);
    int res[] = Sum(arr);
    System.out.println(" ");
    printArr(res);
  }
}

