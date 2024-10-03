a,b,c = 5,6,7

def test(a,b,c):
    tmp1 = a
    tmp2 = b
    a = c
    b = tmp1
    c = tmp2
    print(a)
    print(b)
    print(c)
test(a,b,c)