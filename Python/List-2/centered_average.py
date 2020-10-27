def centered_average(nums):
  sum = 0
  for num in nums:
    sum += num
  sum -= min(nums)
  sum -= max(nums)
  return sum / (len(nums)-2)
