data = list(map(int,input().split()))
c = [1,1,2,2,2,8]

for i in range(6):
  if data[i] == c[i]:
    num = 0
    print(num,end=' ')
  
  elif data[i] > c[i]:
    num = c[i] - data[i]
    print(num,end=' ')
  
  elif data[i] < c[i]:
    num = c[i] - data[i]
    print(num,end=' ')