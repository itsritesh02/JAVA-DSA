public class ArrayExamples {

  void demoArrays() {
    int[] ages = new int[3];
    float[] heights = new float[3];
    String[] names = new String[3];

    ages[0] = 10;
    ages[1] = 20;
    ages[2] = 30;
    heights[0] = 5.5f;
    heights[1] = 6.0f;
    names[0] = "Alice";
    System.out.println("ages[0] = " + ages[0]);
    System.out.println("ages[1] = " + ages[1]);
    System.out.println("ages[2] = " + ages[2]);
    System.out.println("heights[0] = " + heights[0]);
    System.out.println("heights[1] = " + heights[1]);
    System.out.println("names[0] = " + names[0]);
  }

  void MultiArrays() {
    int[][] arrs = new int[2][3];
    int[][] arr = { { 23, 44, 55 }, { 66, 77, 88 }, { 99, 100, 111 } };

    System.out.println("matrix[0][0] = " + arr[0][0]);
    System.out.println("matrix[0][0] = " + arr[0][1]);
    System.out.println("matrix[0][0] = " + arr[0][2]);

    System.out.println("matrix[1][0] = " + arr[1][0]);
    System.out.println("matrix[1][1] = " + arr[1][1]);
    System.out.println("matrix[1][2] = " + arr[1][2]);
    System.out.println("matrix[2][0] = " + arr[2][0]);
    System.out.println("matrix[2][1] = " + arr[2][1]);
    System.out.println("matrix[2][2] = " + arr[2][2]);

  }

  public static void main(String[] args) {
    ArrayExamples obj = new ArrayExamples();
    // obj.demoArrays();
    obj.MultiArrays();
  }

}