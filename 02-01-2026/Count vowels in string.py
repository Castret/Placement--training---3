
s = input()
c = 0
for x in s:
    if x in "aeiouAEIOU":
        c += 1
print(c)