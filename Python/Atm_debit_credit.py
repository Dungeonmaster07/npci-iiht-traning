class Account:
    def __init__(self, id, balance=0, annual_interest_rate=3.4):
        self.id = id
        self.balance = balance
        self.annual_interest_rate = annual_interest_rate

    def getId(self):
        return self.id

    def getBalance(self):
        return self.balance

    def getAnnualInterestRate(self):
        return self.annual_interest_rate

    def getMonthlyInterestRate(self):
        return self.annual_interest_rate/12

    def withdraw(self, amount):
        self.balance -= amount

    def deposit(self, amount):
        self.balance += amount

    def getmonthlyInterest(self):
        return self.balance * self.getMonthlyInterestRate()


def main():
    accounts = []
    for i in range(1000, 9999):
        account = Account(i, 0)
        accounts.append(account)
    while True:
        id = int(input("\nEnter the pin: "))

        while id < 1000 or id > 9999:
            id = int(input("\nInvalid pin... Re-enter the correct pin: "))

        while True:
            print("\n1 - View Balance \t 2 - Withdraw \t 3 - Deposit \t 4 - Exit ")
            selection = int(input("\nEnter your selection: "))

            for acc in accounts:
                if acc.getId() == id:
                    accountObj = acc
                    break
            if selection == 1:
                print(accountObj.getBalance())
            elif selection == 2:
                amt = float(input("\nEnter the amount to be withdrawn: "))
                re_amt = input(
                    "Is this the correct amount, Yes or No? " + str(amt) + " ")

                if re_amt == 'Yes':
                    print("Verifying Withddraw...")
                else:
                    break
                if amt < accountObj.getBalance():
                    accountObj.withdraw(amt)
                    print("Updated Balance: " +
                          str(accountObj.getBalance())+" ")
                else:
                    print("\nYour balance is less than withdrawl ammount: " +
                          str(accountObj.getBalance())+" ")
                    print("\nPlease make a deposit..")
            elif selection == 3:
                amt = float(input("\nEnter amount to deposit: "))
                ver_deposit = input(
                    "Is this the correct amount, Yes, or No ? " + str(amt) + " ")

                if ver_deposit == "Yes":

                    accountObj.deposit(amt)

                    print("\nUpdated Balance: " +
                          str(accountObj.getBalance()) + " n")
                else:
                    break

            elif selection == 4:
                print("Transaction is now complete.")
                print("Current Interest Rate: ",
                      accountObj.annual_interest_rate)
                print("Monthly Interest Rate: ",
                      accountObj.annual_interest_rate / 12)
                print("Thanks for choosing us as your bank")
                exit()

            else:
                print("nThat's an invalid choice.")


# Main function
main()
