public int[] shiftLeft(int[] nums) {
  if (nums.length < 1) {
    return nums;
  }
  int[] result = new int[nums.length];
  result[result.length-1] = nums[0];
  for (int i = 1; i < nums.length; i++) {
    result[i-1] = nums[i];
  }
  return result;
}
