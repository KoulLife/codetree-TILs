a, n = tuple(map(int, input().split()))
res = a
for _ in range(n):
    res += n
    print(res)