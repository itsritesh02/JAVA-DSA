

public class sortedOrNot {

  static void SortedArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {

          System.out.println("Array is not sorted");
          return;
        }

      }
    }
    System.out.println("Array is sorted");
  }

  public static void main(String[] args) {

    int[] arr = { 2, 3, 4, 8, 9 };

    SortedArray(arr);

  }
}