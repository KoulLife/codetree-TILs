n = int(input())
cnt = 0

for i in range(1, int(1e9)):
    n /= i
    if n <= 1:
        break
    cnt += 1
print(cnt + 1)