n1 = int(input())
n2 = list(map(int,input()))

n3, n4, n5, n6 = 0, 0, 0, 0
n3 = n1 * n2[2]
print(n3)
n4 = n1 * n2[1]
print(n4)
n5 = n1 * n2[0]
print(n5)
n6 = n3+(n4*10)+(n5*100)
print(n6)