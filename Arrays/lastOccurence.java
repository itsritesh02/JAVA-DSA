
import java.util.Scanner;

public class lastOccurence {

  static int lastOccurences(int[] arr, int x) {
    int lastIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        lastIndex = i;
      }
    }
    return lastIndex;
  }

  static int countOccurence(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x");
    int x = sc.nextInt();

    // Array ka size
    System.out.println("Enter Sizeof Array");
    int n = sc.nextInt();

    // Array create
    int[] arr = new int[n];

    System.out.println("Enter Array Elements");

    // Array input
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int ans = countOccurence(arr, x);
    System.out.println("x:" + ans);

    int last = lastOccurences(arr, x);
    System.out.println("Last Occurence is :" + last);

  }
}