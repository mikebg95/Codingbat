public int blackjack(int a, int b) {
  if (isOver(a) && isOver(b)) {
    return 0;
  }
  if (isOver(a)) {
    return b;
  }
  if (isOver(b)) {
    return a;
  }
  return Math.max(a, b);
}

public boolean isOver(int x) {
  return (x > 21);
}
