public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  for (int i = 0; i < count-1; i++) {
    result += word + sep;
  }
  if (count > 0) {
    result += word;
  }
  return result;
}
