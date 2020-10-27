public String seeColor(String str) {
  if (str.length() >= 3 && str.startsWith("red")) {
    return "red";
  }
  else if (str.length() >= 4 && str.startsWith("blue")) {
    return "blue";
  }
  else {
    return "";
  }
}
