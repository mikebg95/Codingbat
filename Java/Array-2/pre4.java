public int[] pre4(int[] nums) {
  int[] result = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      return result;
    }
    result[i] = nums[i];
  }
  return result;
}
