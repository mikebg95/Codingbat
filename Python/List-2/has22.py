def has22(nums):
  if 2 in nums:
    for i in range(len(nums)-1):
      if nums[i] == 2 and nums[i+1] == 2:
        return True
    return False
  else:
    return False
