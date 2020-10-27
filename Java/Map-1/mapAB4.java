public Map<String, String> mapAB4(Map<String, String> map) {
  String valA = map.get("a");
  String valB = map.get("b");
  
  if (!map.containsKey("a") || !map.containsKey("b")) {
    return map;
  }
  
  if (valA.length() > valB.length()) {
    map.put("c", valA);
  }
  if (valA.length() < valB.length()) {
    map.put("c", valB);
  }
  if (valA.length() == valB.length()) {
    map.put("a", "");
    map.put("b", "");
  }
  
  return map;

}
