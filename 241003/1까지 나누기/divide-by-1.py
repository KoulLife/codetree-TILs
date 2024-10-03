n = int(input())
cnt = 0
i = 1
while True:
    if n // i <= 1:
        cnt += 1
        break
    n = n // i
    i += 1
    cnt += 1
print(cnt)