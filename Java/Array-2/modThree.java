public boolean modThree(int[] nums) {
  for (int i = 0; i < nums.length-2; i++) {
    if (isEven(nums[i], nums[i+1], nums[i+2]) || isOdd(nums[i], nums[i+1], nums[i+2])) {
      return true;
    }
  }
  return false;
}

public boolean isEven(int a, int b, int c) {
  return (a % 2 == 0 && b % 2 == 0 && c % 2 == 0);
}

public boolean isOdd(int a, int b, int c) {
  return (a % 2 == 1 && b % 2 == 1 && c % 2 == 1);
}
