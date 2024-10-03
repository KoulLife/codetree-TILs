a,b = tuple(map(int, input().split()))

if a <= 0:
    a = 0

for _ in range(b):
    print(a,end="")