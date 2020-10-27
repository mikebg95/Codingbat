public String extraFront(String str) {
  String copy = "";
  if (str.length() < 2) {
    copy = str;
  }
  else {
    copy = str.substring(0, 2);
  }
  return copy + copy + copy;
  
}
