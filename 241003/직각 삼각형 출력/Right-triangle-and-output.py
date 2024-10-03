n = int(input())
star = 1
while True:
    if star > n:
        break
    print("*" * (star*2-1))
    star += 1