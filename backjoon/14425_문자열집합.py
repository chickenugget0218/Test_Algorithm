import sys
n, m = map(int,sys.stdin.readline().split())
s = set()
cnt=0

for _ in range(n):
  data = sys.stdin.readline().rstrip()
  s.add(data) #set은 add 사용
  
for _ in range(m):
  data = sys.stdin.readline().rstrip()
  if data in s:
    cnt += 1
    
print(cnt)