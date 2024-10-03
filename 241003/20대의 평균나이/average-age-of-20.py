stack = []
ageSum = 0
ageCnt = 0
while True:
    n = int(input())
    if n >= 30:
        break
    ageSum += n
    ageCnt += 1
print(f"{ageSum / ageCnt:.2f}")