n = int(input())
arr = list(map(int, input().split()))

def func(arr):
    for i in range(len(arr)):
        arr[i] = abs(arr[i])

func(arr)
for i in range(n):
    print(arr[i], end = " ")