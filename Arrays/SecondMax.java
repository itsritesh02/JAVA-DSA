public class SecondMax {

  static int findMax(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  static int findSecondMax(int[] num) {
    int max = findMax(num);

    for (int i = 0; i < num.length; i++) {
      if (num[i] == max) {
        num[i] = Integer.MIN_VALUE;
      }
    }
    int secondMax = findMax(num);
    return secondMax;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 8, 6, 9, 1, 3 };
    int ans = findMax(nums);
    System.out.println("Max is :" + ans);
    int ans2 = findSecondMax(nums);
    System.out.println("2nd Max is :" + ans2);
  }
}
