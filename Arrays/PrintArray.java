import java.util.Scanner;

public class PrintArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Array ka size

    System.out.println("Enter Size of Array");
    int n = sc.nextInt();


    //create Array According to Size
    int[] arr = new int[n];

//Array input

System.out.println("Enter Array Elaments");
for(int i=0;i<n ;i++){
  arr[i]= sc.nextInt();
}


//Array Print

System.out.println("Array Elements Are");


for(int i=0;i<n;i++){
  System.out.print(arr[i]+" ");
}

  }
}
