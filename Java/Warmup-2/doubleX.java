boolean doubleX(String str) {
  int index = str.indexOf('x');
  return (index != str.length()-1 && str.charAt(index + 1) == 'x');
}
