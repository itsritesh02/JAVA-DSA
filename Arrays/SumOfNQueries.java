public class SumOfNQueries {
  static int sumOfQueries(int arr[], int l, int r){
    int sum=0;
for(int i=l;i<=r;i++){
sum+=arr[i];
}
return sum;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int l=2;
    int r=4;
   int ans = sumOfQueries(arr, l, r);
   System.out.println(ans);
  }
}
