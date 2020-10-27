public Map<String, String> pairs(String[] strings) {
  Map<String, String> result = new HashMap<String, String>();
  for (int i = 0; i < strings.length; i++) {
    String s = strings[i];
    String first = Character.toString(s.charAt(0));
    String last = Character.toString(s.charAt(s.length()-1));
    result.put(first, last);
  }
  return result;
}
