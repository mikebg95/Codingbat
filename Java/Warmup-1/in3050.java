public boolean in3050(int a, int b) {
  return (in30s(a) && in30s(b) || in40s(a) && in40s(b));
}

public boolean in30s(int n) {
  return (n >= 30 && n <= 40);
}

public boolean in40s(int n) {
  return (n >= 40 && n <= 50);
}
