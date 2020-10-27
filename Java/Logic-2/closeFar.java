public boolean closeFar(int a, int b, int c) {
  return ((isClose(a, b) && isFar(a, c) && isFar(b, c)) || (isClose(a, c) && isFar(a, b) && isFar(b, c)));
}

public boolean isClose(int x, int y) {
  return (Math.abs(x-y) <= 1);
}

public boolean isFar(int x, int y) {
  return (Math.abs(x-y) >= 2);
}