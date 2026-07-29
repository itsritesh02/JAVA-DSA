
public class reverseArray {

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  static int[] reverse(int arr[]) {
    int n = arr.length;
    int[] ans = new int[n];
    int j = 0;

    //Traverse Array in Reverse Direction

    // for (int i = n-1; i >= 0; i--) {
    //   ans[j] = arr[i];
    //   j++;
    // }
int i=n-1;
while(i>=0){
  ans[j++] = arr[i--];
}

    return ans;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int ans[] = reverse(arr);
    print(ans);


  }
}


//-------------------------------------------------------------------------------------------------------------------------------------------

/*

public class reverseArray {

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  static int[] reverse(int arr[]) {
    int n = arr.length;
    int[] ans = new int[n];
    int j = 0;

    //Traverse Array in Reverse Direction

    // for (int i = n-1; i >= 0; i--) {
    //   ans[j] = arr[i];
    //   j++;
    // }
int i=n-1;
while(i>=0){
  ans[j++] = arr[i--];
}

    return ans;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int ans[] = reverse(arr);
    print(ans);






  }
}



*/
