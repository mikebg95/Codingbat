public int close10(int a, int b) {
  int aDist = Math.abs(10 - a);
  int bDist = Math.abs(10 - b);

  if (aDist < bDist) {
    return a;
  }
  else if (bDist < aDist) {
    return b;
  }
  else {
    return 0;
  }
  
}
