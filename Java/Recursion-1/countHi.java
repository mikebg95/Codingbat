public int countHi(String str) {
  if (str.length() < 2) {
    return 0;
  }
  
  if (str.substring(0,2).equals("hi")) {
    str = str.substring(2);
    return 1 + countHi(str);
  }
  
  str = str.substring(1);
  return countHi(str);
}
