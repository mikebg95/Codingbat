public String startOz(String str) {
  String newstr = "";
  if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
    newstr += str.charAt(0);
  }
  if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
    newstr += str.charAt(1);
  }
  return newstr;
}
