public String zipZap(String str) {
  if (str.length() < 3) {
    return str;
  }
  String newstr = "";
  for (int i = 0; i < str.length(); i++) {
    if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
      newstr += "zp";
      i += 2;
    }
    else {
      newstr += String.valueOf(str.charAt(i));
    }
  }
  return newstr;
}
