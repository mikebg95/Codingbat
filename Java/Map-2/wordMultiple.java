public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> result = new HashMap<String, Boolean>();
  for (String s: strings) {
    if (!result.containsKey(s)) {
      result.put(s, false);
    }
    else {
      result.put(s, true);
    }
  }
  return result;
}
