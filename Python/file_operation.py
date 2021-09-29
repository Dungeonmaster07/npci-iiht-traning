lst = ['ram', 'shyam', 'subham', ['mohsin', 'ramesh']]
lst0 = lst[:3]
lst1 = lst[3:]
my_string0 = ','.join(lst0)

for _ch in lst1:
    my_string1 = ','.join(_ch)

my_string3 = my_string0 + ',' + my_string1

# print(my_string3)
# print(my_string)
with open('a.txt', 'w+') as f:
    f.write(my_string3)

    f.read()
    res = tuple(my_string3.split(','))

    print(res)
