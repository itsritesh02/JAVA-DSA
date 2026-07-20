public class SearchAraay {

  void search() {

    int[] arr = { 23, 44, 55, 66, 577, 88, 99, 100, 111 };
    int x = 100;
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        ans = i;
        break;
      }

    }
    System.out.println("Index of " + x + " is: " + ans);
  }

  public static void main(String[] args) {
    SearchAraay obj = new SearchAraay();
    obj.search();
  }
}
