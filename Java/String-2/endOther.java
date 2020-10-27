public boolean endOther(String a, String b) {
  if (a.length() == b.length()) {
    return (a.equals(b));
  }
  
  String small = smallest(a, b).toLowerCase();
  String big = biggest(a, b).toLowerCase();
  
  return (big.substring(big.length()-small.length()).equals(small));
}

public String smallest(String a, String b) {
  if (a.length() < b.length()) {
    return a;
  }
  else {
    return b;
  }
}

public String biggest(String a, String b) {
  if (b.length() < a.length()) {
    return a;
  }
  else {
    return b;
  }
}
