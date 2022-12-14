n = int(input())

for i in range(n):
  nums,word = input().split()
  nums = int(nums)
  for j in word:
    print(j*nums,end='')
  print()
  