public int sum67(int[] nums) {
  int sum = 0;
  boolean after6 = false;
  for (int num : nums) {
    if (num == 6 && after6 == false) {
      after6 = true;
    }
    else if (num == 7 && after6 == true) {
      after6 = false;
    }
    else if (after6 == false) {
      sum += num;
    }
  }
  return sum;
}
