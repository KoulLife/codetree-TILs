n = int(input())
num = 1
cnt = 1
while True:
    if cnt > n*n:
        break
    if cnt % n == 0:
        print(num)
    else:
        print(num,end=" ")
    num += 1
    if num == 10:
        num = 1
    cnt += 1