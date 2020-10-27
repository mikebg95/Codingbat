def reverse3(nums):
  tmp = nums[0]
  nums[0] = nums[2]
  nums[2] = tmp
  return nums