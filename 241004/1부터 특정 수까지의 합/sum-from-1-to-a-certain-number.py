n = int(input())

def test(n):
    res = 0
    for i in range(1, n + 1):
        res += i
    return res

print(test(n)//10)