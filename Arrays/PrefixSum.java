public class PrefixSum {
  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
  }


  static int [] preSum(int arr[]){
    for (int i=1;i<arr.length;i++){
      arr[i]+=arr[i-1];

    }
    return arr;
  }

  
  
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    printArr(arr);
    int res[] = preSum(arr);
    System.out.println(" ");
    printArr(res);
  }
}


