public int[] maxEnd3(int[] nums) {
  int value = Math.max(nums[0], nums[2]);
  nums[0] = nums[1] = nums[2] = value;
  return nums;
}
