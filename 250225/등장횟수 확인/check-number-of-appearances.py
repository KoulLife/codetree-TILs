arr = list(map(int, input().split()))

cnt = 0
for a in arr:
    if a % 2 == 0:
        cnt += 1
print(cnt)