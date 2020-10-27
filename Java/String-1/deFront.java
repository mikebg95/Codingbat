public String deFront(String str) {    
  String newstr = "";
  if (str.length() >= 1) {
    if (str.charAt(0) == 'a') {
      newstr += "a";
    }
  }
  if (str.length() >= 2) {
    if (str.charAt(1) == 'b') {
      newstr += "b";
    }
  }
  if (str.length() >= 3) {
    newstr += str.substring(2);
  }
  return newstr;
}
