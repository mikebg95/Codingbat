public String oneTwo(String str) {
  String result = "";
  for (int i = 0; i < str.length()-2; i += 3) {
    result += String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i+2))
    + String.valueOf(str.charAt(i));
  }
  return result;
}
