public boolean noTriples(int[] nums) {
  int triple;
  for (int i = 0; i < nums.length-2; i++) {
    triple = nums[i];
    if (triple == nums[i+1] && triple == nums[i+2]) {
      return false;
    }
  }
  return true;
}
