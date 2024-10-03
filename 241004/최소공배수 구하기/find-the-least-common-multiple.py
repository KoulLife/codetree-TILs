n,m = tuple(map(int, input().split()))

def test(n,m):
    maxNum = max(n, m)
    minNum = min(n, m)
    res = 0
    cnt = 1
    while True:
        if (maxNum * cnt) % minNum == 0:
            res = maxNum * cnt
            break
        cnt += 1
    print(res)

test(n,m)