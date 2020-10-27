public int max1020(int a, int b) {
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }
  
  if (inRange(a)) {
    return a;
  }
  if (inRange(b)) {
    return b;
  }
  return 0;
}

boolean inRange(int n) {
  return (n >= 10 && n <= 20);
}
