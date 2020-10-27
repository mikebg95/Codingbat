public String stringX(String str) {
  
  String newstr = "";
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x' && (i != 0 && i != str.length()-1)) {
        newstr += "";
    }
    else {
      newstr += str.charAt(i);
    }
  }
  return newstr;

}
