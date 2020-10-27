def array_front9(nums):
  if len(nums) < 4:
    for num in nums:
      if num == 9:
        return True
  else:
    for num in nums[:4]:
      if num == 9:
        return True
  return False
