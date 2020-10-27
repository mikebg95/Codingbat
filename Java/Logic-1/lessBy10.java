public boolean lessBy10(int a, int b, int c) {
  return (isDiff(a, b) || isDiff(a, c) || isDiff(b, c));
}

public boolean isDiff(int a, int b) {
  return (Math.abs(a - b) >= 10);
}
