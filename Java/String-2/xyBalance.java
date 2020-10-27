public boolean xyBalance(String str) {
  int xs = 0;
  int ys = 0;
  boolean balanced = true;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x') {
      xs++;
      balanced = false;
    }
    if (str.charAt(i) == 'y') {
      ys++;
      balanced = true;
    }
  }
  return (balanced);
}
