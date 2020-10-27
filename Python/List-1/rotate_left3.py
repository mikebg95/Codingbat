def rotate_left3(nums):
  tmp = nums[0]
  nums[0] = nums[1]
  nums[1] = nums[2]
  nums[2] = tmp
  return nums