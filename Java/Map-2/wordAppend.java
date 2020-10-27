public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    String s = strings[i];
    if (!map.containsKey(s)) {
      map.put(s, 1);
    }
    else {
      int count = map.get(s) + 1;
      map.put(s, count);
    }
    if (map.get(s) % 2 == 0) {
      result += s;
    }
  }
  return result;
}
