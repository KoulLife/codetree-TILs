arr = list(map(int,input().split()))

def func(arr):
    if arr[0] > arr[1]:
        arr[0] = arr[0] + 25
        arr[1] = arr[1] * 2
    else:
        arr[0] = arr[0] * 2
        arr[1] = arr[1] + 25

func(arr)

print(arr[0], arr[1])