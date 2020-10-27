public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> result = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    String s = strings[i];
    if (result.containsKey(s)) {
      result.put(s, result.get(s) + 1);
    }
    else {
      result.put(s, 1);
    }
  }
  return result;
}
