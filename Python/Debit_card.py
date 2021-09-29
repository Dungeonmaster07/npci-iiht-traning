balance = 0


def deposit(balance):
    amount = float(input("Enter amount to be Deposited: "))
    balance += amount
    print("\n Amount Deposited:", amount)


def withdraw(balance):
    amount = float(input("Enter amount to be Withdrawn: "))
    if balance >= amount:
        balance -= amount
        print("\n You Withdrew:", amount)
    else:
        print("\n Insufficient balance  ")


def display(balance):
    print("\n Net Available Balance=", balance)


dp = deposit()
print(dp(balance))

wd = withdraw()
print(wd(balance))

d = display()
print(d(balance))
