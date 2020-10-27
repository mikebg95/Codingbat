def string_bits(str):
  result = ""
  for i in range(len(str)):
    if i % 2 is 0:
      result = result + str[i]
  return result
