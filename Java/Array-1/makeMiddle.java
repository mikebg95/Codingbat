public int[] makeMiddle(int[] nums) {
  int middle = (nums.length / 2) - 1;
  int[] result = new int[2];
  result[0] = nums[middle];
  result[1] = nums[middle+1];
  return result;
}
