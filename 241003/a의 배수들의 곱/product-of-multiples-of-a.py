a,b = tuple(map(int, input().split()))
res = 1
for i in range(1, b + 1, 1):
    if i % a == 0:
        res *= i
print(res)