a,b,c = map(int,input().split())

res = a if a < b else b
res = res if res < c else c
print(res)