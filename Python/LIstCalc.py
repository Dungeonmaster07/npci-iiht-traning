lst = [1, 2, 3, 4, 1]

for i in lst:
    if i == i+1:
        print("Duplicate record found")
        i += 1

    else:
        print("The numbers are ok")
