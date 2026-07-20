public class maxElement {

  void ArrayMaxElement() {
    int[] arr = { 23, 44, 55, 66, 577, 88, 99, 100, 111 };
    int max = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }

    }
    System.out.println("Max Element in Array is: " + max);
  }

  public static void main(String[] args) {
    maxElement obj = new maxElement();
    obj.ArrayMaxElement();
  }
}
