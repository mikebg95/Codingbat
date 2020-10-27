public boolean haveThree(int[] nums) {
  int count3 = 0;
  if (nums.length > 0 && nums[0] == 3) {
    count3++;
  }
  for (int i = 1; i < nums.length; i++) {
    if (nums[i] == 3 && nums[i-1] == 3) {
      return false;
    }
    if (nums[i] == 3) {
      count3++;
    }
  }
  return (count3 == 3);
}
