def string_match(a, b):
  if len(a) < len(b):
    shortest = a
  else:
    shortest = b
  counter = 0;
  for i in range(len(shortest)-1):
    if a[i:i+2] == b[i:i+2]:
      counter += 1
  return counter;
    