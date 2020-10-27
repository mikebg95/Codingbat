public String stringSplosion(String str) {
  String newstr = "";
  for (int i = 0; i < str.length(); i++) {
    newstr += str.substring(0, i + 1);
  }
  return newstr;
}
