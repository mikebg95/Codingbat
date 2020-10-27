public String stringBits(String str) {
  String newstr = "";
  for (int i = 0; i < str.length(); i += 2) {
    newstr += str.charAt(i);
  }
  return newstr;
}
