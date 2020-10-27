public int[] midThree(int[] nums) {
  int[] result = new int[3];
  int middle = (int) Math.floor(nums.length/2);
  result[0] = nums[middle-1];
  result[1] = nums[middle];
  result[2] = nums[middle+1];
  return result;
}
