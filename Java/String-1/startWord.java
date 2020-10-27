public String startWord(String str, String word) {
  if (str.length() >= 1) {
    if (str.substring(1).startsWith(word.substring(1))) {
      return str.substring(0, word.length());
    }
  }
  return "";
}
