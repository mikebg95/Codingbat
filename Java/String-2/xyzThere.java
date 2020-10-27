public boolean xyzThere(String str) {
  if (str.length() == 3) {
    return str.equals("xyz");
  }
  for (int i = 0; i < str.length()-3; i++) {
    if (i == 0) {
      if (str.substring(0, 3).equals("xyz")) {
        return true;
      }
    }
    if (str.charAt(i) != '.' && str.substring(i+1, i+4).equals("xyz")) {
      return true;
    }
  }
  return false;
}
