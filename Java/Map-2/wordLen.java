public Map<String, Integer> wordLen(String[] strings) {
  
  Map<String, Integer> result = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    result.put(strings[i], strings[i].length());
  }
  return result;
}
