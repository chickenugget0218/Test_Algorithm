# 시간초과
import sys
n = int(sys.stdin.readline())
card = list(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())
r = list(map(int,sys.stdin.readline().split()))

answer=[]
for i in range(len(r)):
  if r[i] in card:
    answer.append(1)
  else:
    answer.append(0)

print(*answer)


# set 사용
import sys
n = int(sys.stdin.readline())
card = set(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())
r = list(map(int,sys.stdin.readline().split()))


for i in r:
  if i in card:
    print(1,end=' ')
  else:
    print(0,end=' ')
