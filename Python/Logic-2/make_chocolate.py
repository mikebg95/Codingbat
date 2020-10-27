def make_chocolate(small, big, goal):
  remainder = 0
  if 5 * big < goal:
    remainder = goal - big * 5

  elif 5 * big > goal:
    remainder = goal % 5
    
  if remainder <= small:
    return remainder
  else:
    return -1
