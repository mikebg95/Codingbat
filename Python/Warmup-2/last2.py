def last2(str):
  if len(str) < 2:
    return 0
  else:
    lasttwo = str[len(str) - 2:]
    count = 0
    for i in range(len(str) - 2):
      substr = str[i:i + 2]
      if substr == lasttwo:
        count += 1
    return count