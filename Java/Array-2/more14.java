public boolean more14(int[] nums) {
  int num1 = 0;
  int num4 = 0;
  for (int num : nums) {
    if (num == 1) {
      num1++;
    }
    if (num == 4) {
      num4++;
    }
  }
  return (num1 > num4);
}
