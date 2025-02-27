res = 0
n,m = map(int, input().split())
arr = list(map(int, input().split()))

def cal():
    global m
    global arr
    global res

    while True:
        res += arr[m - 1]
        
        if m == 1:
            break

        if m % 2 == 0:
            m //= 2
        else:
            m -= 1
 
cal()

print(res)