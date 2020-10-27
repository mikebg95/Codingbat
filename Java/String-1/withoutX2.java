public String withoutX2(String str) {
  String newstr = "";
  if (str.length() == 0) {
    return str;
  }
  if (str.length() >= 1 && (str.charAt(0) != 'x')) {
      newstr += str.charAt(0);
  }
  if (str.length() >= 2 && (str.charAt(1) != 'x')) {
      newstr += str.charAt(1);
  }
  if (str.length() >= 3) {
    newstr += str.substring(2);
  }
  return newstr;
}
