my_set = {-15, -26, 15, 1, 23, -64, 23, 76}

my_list = list(my_set)
new_list = []

while my_list:
    min = my_list[0]
    for x in my_list:
        if x < min:
            min = x
    new_list.append(min)
    my_list.remove(min)
new_set = set(new_list)
print(new_set)
