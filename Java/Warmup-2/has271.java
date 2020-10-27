public boolean has271(int[] nums) {
  for (int i = 0; i < nums.length-2; i++) {
    int first = nums[i];
    int second = nums[i+1];
    int third = nums[i+2];
    if (second == first + 5 && (Math.abs(third - (first - 1)) <= 2)) {
      return true;
    }
  }
  return false;
}
