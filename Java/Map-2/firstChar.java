public Map<String, String> firstChar(String[] strings) {
  Map<String, String> result = new HashMap<String, String>();
  for (int i = 0; i < strings.length; i++) {
    String s = strings[i].substring(0, 1);
    if (!result.containsKey(s)) {
      result.put(s, strings[i]);
    }
    else {
      String value = result.get(s);
      result.put(s, value + strings[i]);
    }
  }
  return result;
}
