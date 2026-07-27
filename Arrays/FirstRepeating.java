public class FirstRepeating {
static int firstRepeating(int [] nums){
  for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        return nums[i];
      }
    }
  }
  return -1;
}

  public static void main(String[] args) {
    int nums[] = {2, 1, 4, 3, 5 ,7 ,9,3};
    int ans = firstRepeating(nums);

    if(ans !=-1){
      System.out.println("First Reapeating is :"+ans);
    }
    else{
      System.out.println("no reapeat");
    }
  }
}
