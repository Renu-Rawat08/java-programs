# expensee tracker project 

# list of expenses in from of Dictonaries
expensesList = []
print("😊Welcome to Expense Tracker : kharcha kam kiya karo! ")
while True:
    print("====MENU====")
    print("1. Add Expense")
    print("2. View All Expense")
    print("3. View Total Karcha")
    print("4. Exit")
    choice = int(input("Please Enter Your Choice : "))
    if(choice ==1):
        date = input("kis date ko kharcha kiya tha ? :")
        category = input("kis type ka kharcha kiya ? (food , travel ,makep , book): ")
        description =input("aur detail dedo : ")
        amount = float(input("enter the amount : "))
        expense = {
            "date": date,
            "category": category,
            "description" : description,
            "amount" : amount
        }   
        expensesList.append(expense)
        print("\n Done bro😊. Expense is added successfully🎉")

# 2. view all expense 
    if(choice ==2):
        if(len(expensesList)==0):
            print("No Ezpense added. jao phela kharcha karo. ")
        else:
            print("==== Ye y apka sara expense ====")
            count = 1 
            for eachKharcha in expensesList :
                print(f"Kharcha Number {count} ->{eachKharcha["date"]},{eachKharcha["category"]},{eachKharcha["description"]},{eachKharcha["amount"]}")
                count= count+1

# 3. view total kharcha
    if(choice==3):
        totalKharcha = 0
        for eachKharcha in expensesList:
            totalKharcha += eachKharcha["amount"]
        print(f"Total kharcha is : {totalKharcha}")


# 4. Exit
    if(choice==4):
        print("Dhanywaad aapne hamara system use kiya")
        break

    else:
        print("Invalid Choice. TRY AGAIN !")