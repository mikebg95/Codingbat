public int[] tenRun(int[] nums) {
  int n = 0;
  boolean after = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      n = nums[i];
      after = true;
    }
    else {
      if (after) {
        nums[i] = n;
      }
    }
  }
  return nums;
}
