rows = int(input("Enter no of rows : "))
lst1 = []
lst2 = []
final = []
k = 0
gap = 2

for i in range(1, rows+1):
    print(end=" ")
num = gap
k = 1
sum = 0
new = []
for j in range(rows):
    if k <= i:
        print(" ", num, " ", end=" ")
        k += 1
        sum += num
        new.append(num)
        num += 1
    else:
        new.append(0)
lst2.append(new)
lst1.append(sum)

k = 0
gap += 3
print()
final.append(lst2)

# part 2
print(lst1)

# part 3
print(lst2[::-1])

# part 4
sqr = []
for i in lst2:
    sqt = []
    for j in i:
        sqt.append(j*j)
    sqr.append(sqt)
print(sqr[::-1])
