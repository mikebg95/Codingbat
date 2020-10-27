def combo_string(a, b):
  if len(b) < len(a):
    return b + a + b
  elif len(a) < len(b):
    return a + b + a
