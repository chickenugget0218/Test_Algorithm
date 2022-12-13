x = int(input()) #26
nums = list(map(int,input().split()))
find = int(input())
cnt=0
              
for i in range(len(nums)):
  if nums[i] == find:
    cnt += 1
print(cnt)