

my_tuple = (1, 2, 3, 4, [5, 6, 1, 2, [8, 9, 5, 6]])
x = 1
count = 0
my_tuple1 = my_tuple[:4]
print(my_tuple1)
my_tuple2 = my_tuple[4]
print(my_tuple2)
# print(my_tuple)
for i in my_tuple1:

    for j in my_tuple2:
        if(i == j):
            print(my_tuple1[i])
