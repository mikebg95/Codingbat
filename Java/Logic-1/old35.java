public boolean old35(int n) {
  return (of3(n) != of5(n));
}

public boolean of3(int n) {
  return (n % 3 == 0);
}

public boolean of5(int n) {
  return (n % 5 == 0);
}
