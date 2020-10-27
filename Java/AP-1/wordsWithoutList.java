public List wordsWithoutList(String[] words, int len) {
  List<String> result = new ArrayList<>();
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() != len) {
      result.add(words[i]);
    }
  }
  return result;
}
