h1Age, h1Gender = tuple(map(str, input().split()))
h2Age, h2Gender = tuple(map(str, input().split()))

if (int(h1Age) >= 19 and h1Gender == 'M') or (int(h2Age) >= 19 and h2Gender == 'M'):
    print(1)
else:
    print(0)