n = int(input())
sum_val = 0

for _ in range(n):
    sum_val += int(input())

print(sum_val, end = " ")
print(f"{sum_val/n:.1f}")