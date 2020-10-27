public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum;
  
  if (noDoubles && die1 == die2) {
    die1 = increment(die1);
  }
  sum = die1 + die2;
  return sum;
}

public int increment(int n) {
  if (n == 6) { n = 1; }
  else { n++; }
  return n;
}
