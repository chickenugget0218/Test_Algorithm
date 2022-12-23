import sys
data = []
n = int(sys.stdin.readline())
for i in range(n):
  data.append(int(sys.stdin.readline()))

data = sorted(data)
for j in range(0,len(data)):
  print(data[j])