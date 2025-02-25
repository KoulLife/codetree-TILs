a,b = map(int, input().split())

l = a+1 if a%2 == 0 else a

for i in range(l, b+1, 2):
    print(i, end=' ')