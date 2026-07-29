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

//-----------------------------------------------------------------------------------------------------------------------


/*
public class ArrayExamples {
// Hindi: ArrayExamples naam ki class banayi.
// English: Created a class named ArrayExamples.

    void demoArrays() {
    // Hindi: demoArrays() method 1D arrays ka example dikhata hai.
    // English: The demoArrays() method demonstrates 1D arrays.

        int[] ages = new int[3];
        // Hindi: 3 size ka integer array banaya.
        // English: Created an integer array of size 3.

        float[] heights = new float[3];
        // Hindi: 3 size ka float array banaya.
        // English: Created a float array of size 3.

        String[] names = new String[3];
        // Hindi: 3 size ka String array banaya.
        // English: Created a String array of size 3.

        ages[0] = 10;
        // Hindi: Pehle index par 10 store kiya.
        // English: Stored 10 at index 0.

        ages[1] = 20;
        // Hindi: Dusre index par 20 store kiya.
        // English: Stored 20 at index 1.

        ages[2] = 30;
        // Hindi: Teesre index par 30 store kiya.
        // English: Stored 30 at index 2.

        heights[0] = 5.5f;
        // Hindi: Height 5.5 first index par store ki.
        // English: Stored 5.5 at index 0.

        heights[1] = 6.0f;
        // Hindi: Height 6.0 second index par store ki.
        // English: Stored 6.0 at index 1.

        names[0] = "Alice";
        // Hindi: Pehle index par "Alice" store kiya.
        // English: Stored "Alice" at index 0.

        System.out.println("ages[0] = " + ages[0]);
        // Hindi: First age print ki.
        // English: Printed the first age.

        System.out.println("ages[1] = " + ages[1]);
        // Hindi: Second age print ki.
        // English: Printed the second age.

        System.out.println("ages[2] = " + ages[2]);
        // Hindi: Third age print ki.
        // English: Printed the third age.

        System.out.println("heights[0] = " + heights[0]);
        // Hindi: First height print ki.
        // English: Printed the first height.

        System.out.println("heights[1] = " + heights[1]);
        // Hindi: Second height print ki.
        // English: Printed the second height.

        System.out.println("names[0] = " + names[0]);
        // Hindi: First name print kiya.
        // English: Printed the first name.
    }

    void MultiArrays() {
    // Hindi: MultiArrays() method 2D array ka example dikhata hai.
    // English: The MultiArrays() method demonstrates a 2D array.

        int[][] arrs = new int[2][3];
        // Hindi: 2 rows aur 3 columns ka empty 2D array banaya.
        // English: Created an empty 2D array with 2 rows and 3 columns.

        int[][] arr = {
            {23, 44, 55},
            {66, 77, 88},
            {99, 100, 111}
        };
        // Hindi: Values ke saath 3×3 matrix banayi.
        // English: Created a 3×3 matrix with values.

        System.out.println("matrix[0][0] = " + arr[0][0]);
        // Hindi: First row, first column print ki.
        // English: Printed the first row, first column.

        System.out.println("matrix[0][1] = " + arr[0][1]);
        // Hindi: First row, second column print ki.
        // English: Printed the first row, second column.

        System.out.println("matrix[0][2] = " + arr[0][2]);
        // Hindi: First row, third column print ki.
        // English: Printed the first row, third column.

        System.out.println("matrix[1][0] = " + arr[1][0]);
        // Hindi: Second row, first column print ki.
        // English: Printed the second row, first column.

        System.out.println("matrix[1][1] = " + arr[1][1]);
        // Hindi: Second row, second column print ki.
        // English: Printed the second row, second column.

        System.out.println("matrix[1][2] = " + arr[1][2]);
        // Hindi: Second row, third column print ki.
        // English: Printed the second row, third column.

        System.out.println("matrix[2][0] = " + arr[2][0]);
        // Hindi: Third row, first column print ki.
        // English: Printed the third row, first column.

        System.out.println("matrix[2][1] = " + arr[2][1]);
        // Hindi: Third row, second column print ki.
        // English: Printed the third row, second column.

        System.out.println("matrix[2][2] = " + arr[2][2]);
        // Hindi: Third row, third column print ki.
        // English: Printed the third row, third column.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        ArrayExamples obj = new ArrayExamples();
        // Hindi: Class ka object banaya.
        // English: Created an object of the class.

        // obj.demoArrays();
        // Hindi: Agar uncomment karoge to 1D array wala method chalega.
        // English: Uncomment to execute the 1D array method.

        obj.MultiArrays();
        // Hindi: 2D array wala method call kiya.
        // English: Called the 2D array method.
    }
}
*/