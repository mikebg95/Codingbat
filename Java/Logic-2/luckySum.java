public int luckySum(int a, int b, int c) {
  int sum = 0;
  boolean after13 = false;
  if (a != 13) {
    sum += a;
  }
  else {
    after13 = true;
  }
  if (b != 13) {
    if (!after13) {
      sum += b;
      after13 = false;
    }
  }
  else {
    after13 = true;
  }
  if (c != 13 && !after13) {
    sum += c;
  }
  return sum;
}
