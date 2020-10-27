public int[] makeLast(int[] nums) {
  int[] array = new int[2*nums.length];
  array[array.length-1] = nums[nums.length-1];
  return array;
}
