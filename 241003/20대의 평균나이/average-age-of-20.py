stack = []

while True:
    n = int(input())
    if n >= 30:
        break
    stack.append(n)

print(f"{sum(stack) / len(stack):.2f}")