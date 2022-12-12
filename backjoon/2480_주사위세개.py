import sys
a,b,c = map(int, sys.stdin.readline().split())

if a == b == c:
  money = 10000+(a*1000)
  print(money)
elif a == b:
  money = 1000+(a*100)
  print(money)
elif b == c:
  money = 1000+(b*100)
  print(money)
elif a == c:
  money = 1000+(c*100)
  print(money)
else:
  big = max(a,b,c)
  money = big*100
  print(money)
