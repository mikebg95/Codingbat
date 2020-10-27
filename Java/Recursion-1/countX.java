public int countX(String str) {
  if (str.length() == 0) {
    return 0;
  }
  if (str.charAt(0) == 'x') {
    str = str.substring(1);
    return 1 + countX(str);
  }
  
  str = str.substring(1);
  return countX(str);
}
