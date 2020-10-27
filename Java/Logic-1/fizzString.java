public String fizzString(String str) {
  String newstr = "";
  if (str.charAt(0) != 'f' && str.charAt(str.length()-1) != 'b') {
    return str;
  }
  if (str.charAt(0) == 'f') {
    newstr += "Fizz";
  }
  if (str.charAt(str.length()-1) == 'b') {
    newstr += "Buzz";
  }
  return newstr;
}
