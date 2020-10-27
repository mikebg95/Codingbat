public int teenSum(int a, int b) {
  if (isTeen(a) || isTeen(b)) {
    return 19;
  }
  else {
    return a + b;
  }
}

public boolean isTeen(int n) {
  return (n >= 13 && n <= 19);
}
