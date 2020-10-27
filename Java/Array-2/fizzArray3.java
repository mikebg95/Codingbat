public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  for (int i = 0; i < end-start; i++) {
    result[i] = i + start;
  }
  return result;
}
