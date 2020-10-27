public int last2(String str) {
  
  int count = 0;
  
  // if string shorter than 2 chars
  if (str.length() < 2) {
    return 0;
  }
  
  // check last 2 chars of string
  String end = str.substring(str.length()-2);
  
  // go through loop and compare substrings to end
  for (int i = 0; i < str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    
    if (sub.equals(end)) {
      count++;
    }
  }
    
  return count;
    
  }
