isRight = True
for i in range(5):
    n = int(input())
    if n % 3 != 0:
        isRight = False
if isRight == True:
    print(1)
else:
    print(0)