public String lastChars(String a, String b) {
  String newstr = "";
  if (a.length() == 0) {
    newstr += "@";
  }
  else {
    newstr += a.charAt(0);
  }
  if (b.length() == 0) {
    newstr += "@";
  }
  else {
    newstr += b.charAt(b.length()-1);
  }
  return newstr;
}
