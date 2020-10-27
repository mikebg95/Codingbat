public int sum13(int[] nums) {
  int sum = 0;
  boolean after13 = false;
  for (int num: nums) {
    if (num != 13) {
      if (after13 == false) {
        sum += num;
      }
      else {
        after13 = false;
      }
    }
    else {
      after13 = true;
    }
  }
  return sum;
}
