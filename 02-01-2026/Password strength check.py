p = input()
f = 0
if len(p) >= 8:
    if any(i.isdigit() for i in p):
        if any(i.isupper() for i in p):
            f = 1
print("strong" if f else "weak")