n1, n2 = list(map(int,input().split()))
s1 = str(n1)
s2 = str(n2)

r1, r2 = s1[::-1], s2[::-1] 
if r1 > r2:
  print(r1)
else:
  print(r2)