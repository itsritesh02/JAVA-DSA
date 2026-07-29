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
