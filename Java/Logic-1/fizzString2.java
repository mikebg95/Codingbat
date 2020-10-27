public String fizzString2(int n) {
  if (!by3(n) && !by5(n)) {
    return n + "!";
  }
  if (by3(n) && by5(n)) {
    return "FizzBuzz!";
  }
  if (by3(n)) {
    return "Fizz!";
  }
  else {
    return "Buzz!";
  }
}

public boolean by3(int n) {
  return (n % 3 == 0);
} 

public boolean by5(int n) {
  return (n % 5 == 0);
}
