public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    String c = Character.toString(str.charAt(i));
    result += c + c;
  }
  return result;
}
