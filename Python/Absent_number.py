list1 = [1, 2, 4, 5, 6, 8, 9]

a = len(list1)

total = (a+1)*(a+2)/2

sum_of_list1 = sum(list1)

print("The number ", total-sum_of_list1, " is missing in the list")


for x in range(list1[0], list1[-1]+1):
    if x not in list1:
        print("The missing numbers are ", x)
