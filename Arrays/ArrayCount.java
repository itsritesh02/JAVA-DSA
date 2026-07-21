import java.util.Scanner;

public class ArrayCount {


static int countOccurences(int[]arr, int x){
  int count =0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
      count++;
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

    System.out.println("Enter x");
    int x = sc.nextInt();

    int ans =countOccurences(arr, x);
    System.out.println("Count of x :"+ans);
  }
}
