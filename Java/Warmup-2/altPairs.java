public String altPairs(String str) {
  String newstr = "";
  
  for (int i = 0; i < str.length(); i += 4) {
    
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    
    newstr += str.substring(i, end);
  }
  
  return newstr;
}
