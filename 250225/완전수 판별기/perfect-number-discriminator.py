n = int(input())
sum_val = 0

arr = []
for i in range(1, n):
    if n % i == 0:
        arr.append(i)

for a in arr:
    sum_val += a

if sum_val == n:
    print('P')
else:
    print('N')