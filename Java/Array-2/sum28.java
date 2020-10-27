public boolean sum28(int[] nums) {
  int sum2 = 0;
  for (int num : nums) {
    if (num == 2) {
      sum2 += 2;
    }
  }
  return (sum2 == 8);
}
