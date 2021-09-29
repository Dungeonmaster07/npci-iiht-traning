
lst = []
dict = {}
dict_sorted = {}


def create_dict(lst):
    for i in lst:
        dict[i] = i
        print(dict[i])


def descend_sort(dict):
    print({k: v for k, v in sorted(
        dict.items(), key=lambda item: item[1])})


def final_list(final_list): return lst.append(final_list)


def display():
    i = int(input("Enter the step you want to proceed with : "))
    if i == 1:
        final_list(int(input("Enter the elements : ")))
    if (i == 2 or i == 3) and (len(lst) == 0):
        final_list[int(input("Enter the elements : "))]
    if i == 2:
        create_dict(lst)

    if i == 3:
        descend_sort(dict)

    if i != 4:
        display()


display()
print(lst)
print(dict)
