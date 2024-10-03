a,b = tuple(map(int, input().split()))
isHere = False
for i in range(a, b + 1):
    if (1920 % i == 0) and (2880 % i == 0):
        isHere = True
        break
if isHere == True:
    print(1)
else:
    print(0)