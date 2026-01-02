n = int(input())
f = 1
for i in range(2, n):
    if n % i == 0:
        f = 0
        break
print("prime" if f and n > 1 else "not prime")
