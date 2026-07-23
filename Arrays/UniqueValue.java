// No pair should be their

import java.util.Scanner;

public class UniqueValue {
  static void unique(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;

        }
      }
     
      if(count==1){
        System.out.print(arr[i]+" ");
      }
    }
   
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

unique(arr);

  }
}
