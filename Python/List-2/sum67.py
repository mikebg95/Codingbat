def sum67(nums):
  sum = 0
  record = True
  
  for i in range(len(nums)):
    if nums[i] == 6:
      record = False
    if record:
      sum += nums[i]
    if nums[i] == 7:
      record = True
      
  
  return sum
    