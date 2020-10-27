public boolean shareDigit(int a, int b) {
  return (left(a) == left(b) || left(a) == right(b)
  || right(a) == left(b) || right(a) == right(b));
}

public int left(int n) {
  return (int) Math.floor(n / 10);
}

public int right(int n) {
  return (n % 10);
}
