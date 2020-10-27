def cat_dog(str):
  catcount = 0
  dogcount = 0
  for i in range(len(str)-2):
    if str[i:i+3] == 'cat':
      catcount += 1
    elif str[i:i+3] == 'dog':
      dogcount += 1
  return (catcount == dogcount)