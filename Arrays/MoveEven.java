public class MoveEven {

  static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void swapArr(int arr[], int i, int k) {

    int temp = arr[i];
    arr[i] = arr[k];
    arr[k] = temp;

  }

  static void moveArr(int[] arr) {
    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {

        swapArr(arr, i, k);
        k++;
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    printArr(arr);
    moveArr(arr);
    printArr(arr);
  }
}


