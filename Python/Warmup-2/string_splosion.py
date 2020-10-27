def string_splosion(str):
  result = ""
  for i in range(len(str)):
    result = result + str[0:i + 1]
  return result
