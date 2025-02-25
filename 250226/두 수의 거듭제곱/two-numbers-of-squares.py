def func1(a, b):
    res = 1
    for i in range(b):
        res = res * a
    return res

a,b = map(int, input().split())
print(func1(a,b))