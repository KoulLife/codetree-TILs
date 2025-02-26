def func1(a, o, c):
    if o == '+':
        return a + c
    elif o == '-':
        return a - c
    elif o == '/':
        return a//c
    elif o == '*':
        return a * c
    else:
        return 'False'

a,o,c = map(str, input().split())

a = int(a)
c = int(c)

if func1(a,o,c) == 'False':
    print('False')

print(f"{a} {o} {c} = {func1(a,o,c)}")