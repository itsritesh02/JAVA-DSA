
public class reverse {

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  static void SwapInArrray(int []arr, int i, int j){
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
  }




  static void reverseArr(int arr[]) {
    int n = arr.length;
  
    int i=0;
    int j=n-1;
    while(i<j){
SwapInArrray(arr, i, j);

i++;
j--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    System.out.print("Oiginal Array: ");
    print(arr);
     reverseArr(arr);
     System.out.print("Reversd Array: ");
    print(arr);

  }
}
