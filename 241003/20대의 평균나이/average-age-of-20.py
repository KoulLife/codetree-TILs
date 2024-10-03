ageSum = 0
ageCnt = 0
while True:
    age = int(input())
    if age < 20 or age >= 30:
        break
    ageSum += age
    ageCnt += 1
print(f"{ageSum/ageCnt:.2f}")