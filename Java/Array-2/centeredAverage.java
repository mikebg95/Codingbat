public int centeredAverage(int[] nums) {
  int largest = nums[0];
  int smallest = nums[0];
  int total = 0;
  for (int i = 0; i < nums.length; i++) {
    total += nums[i];
    largest = Math.max(largest, nums[i]);
    smallest = Math.min(smallest, nums[i]);
  }
  total = total - largest - smallest;
  return total / (nums.length - 2);
}
