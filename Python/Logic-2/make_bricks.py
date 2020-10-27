def make_bricks(small, big, goal):
  remainder = 0
  if big * 5 == goal:
    return True
  elif big * 5 <= goal:
    remainder = goal - big * 5
    if small >= remainder:
      return True
  elif big * 5 >= goal:
    remainder = goal % 5
    if small >= remainder:
      return True
  return False
    
