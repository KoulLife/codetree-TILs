a, b = tuple(map(int, input().split()))
arr = []
while a <= b:
    if a % 2 == 0:
        arr.append(a)
    a += 1
for i in arr:
    print(i,end=" ")