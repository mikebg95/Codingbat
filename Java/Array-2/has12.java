public boolean has12(int[] nums) {
  boolean is1 = false;
  for (int num : nums) {
    if (num == 1) {
      is1 = true;
    }
    if (num == 2 && is1 == true) {
      return true;
    }
  }
  return false;
}
