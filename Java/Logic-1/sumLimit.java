public int sumLimit(int a, int b) {
  int aDigits = String.valueOf(a).length();
  int bDigits = String.valueOf(b).length();
  int sumDigits = String.valueOf(a + b).length();
  if (sumDigits > aDigits) {
    return a;
  }
  return a + b;
}
