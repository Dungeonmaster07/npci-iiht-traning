n = int(input("Enter the number of rows: "))
diff = int(input("Enter the difference in column wise numbers: "))
lst = list()
k = 2 * n - 2
x = 1
sum=1
for i in range(1, n+1):
    for j in range(0, k):
        print(end=" ")
    k = k - 1
    
    for j in range(i):
        print(x, end=" ")
    print("\r")
    lst.append(i*x)
    x +=diff
    print()

print("\n", lst)




