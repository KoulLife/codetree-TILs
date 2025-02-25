def print_num(n):
    num = 1
    for i in range(n):
        for j in range(n):
            print(num, end=" ")
            num = (num + 1) % 10
            if num == 0:
                num += 1
        print()

n = int(input())

print_num(n)