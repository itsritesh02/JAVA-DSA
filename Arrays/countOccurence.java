import java.util.Scanner;

public class countOccurence {


static int countOccurences(int [] arr, int x){
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
 


        int ans = countOccurences(arr, x);
         System.out.println("x:"+ ans);

    }
}

