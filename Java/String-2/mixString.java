public String mixString(String a, String b) {
  String result = "";
  for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
    result += Character.toString(a.charAt(i)) + Character.toString(b.charAt(i));
  }
  if (a.length() < b.length()) {
    result += b.substring(a.length());
  }
  if (b.length() < a.length()) {
    result += a.substring(b.length());
  }
  return result;
}
