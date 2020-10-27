public boolean arrayFront9(int[] nums) {
  int checked = 4;
  checked = Math.min(checked, nums.length);

  for (int i = 0; i < checked; i++) {
    if (nums[i] == 9) {
      return true;
    }
  }
  return false;
}
