a,b = tuple(map(int, input().split()))

if a <= 0:
    print(0)
else:
    for _ in range(b):
    print(a,end="")