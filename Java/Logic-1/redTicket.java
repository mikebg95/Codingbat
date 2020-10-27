public int redTicket(int a, int b, int c) {
  if (a == b && a == c && a == 2) {
    return 10;
  }
  if (a == b && a == c) {
    return 5;
  }
  if (b != a && c != a) {
    return 1;
  }
  return 0;
}
