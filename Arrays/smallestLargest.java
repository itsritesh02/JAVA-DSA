

public class smallestLargest {

  static void SmallestLargest(int arr[]) {
    int largest = arr[0];
    int smallest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {

        largest = arr[i];
      }
      if (arr[i] < smallest) {

        smallest = arr[i];
      }
    }

    System.out.println("Largest = " + largest);
    System.out.println("Smallest = " + smallest);
  }

  public static void main(String[] args) {

    int[] arr = { 2, 1, 7, 8, 9 };

    SmallestLargest(arr);

  }
}