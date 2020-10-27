public int maxTriple(int[] nums) {
  int middle = (int) Math.ceil(nums.length/2);
  int largest = Math.max(nums[0], nums[middle]);
  return Math.max(largest, nums[nums.length-1]);
}
