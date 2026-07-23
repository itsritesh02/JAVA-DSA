import java.util.Scanner;

public class TripletSum {
  static int sum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            System.out.println("Indices are: " + i + " , " + j + " , " + k);
            count++;
          }
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Array ka size

    System.out.println("Enter Size of Array");
    int n = sc.nextInt();

    // create Array According to Size
    int[] arr = new int[n];

    // Array input

    System.out.println("Enter Array Elaments");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter target");
    int Target = sc.nextInt();
    int total = sum(arr, Target);
    System.out.println("total triplets are :" + total);
  }
}
