# first Question
num1 = int(input("Enter first number : "))
num2 = int(input("Enter second number : "))

while True:
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Exit")
    choice = int(input("Enter your choice : "))
    if(choice==1):
        print(f"Addition of {num1} and {num2} is : ",num1+num2)
    elif(choice==2):
        print(f"Subtraction of {num1} and {num2} is : ",num1-num2)
    elif(choice==3):
        print(f"Multiplication of {num1} and {num2} is : ",num1*num2)
    elif(choice==4):
        if(num2!=0):
            print(f"Division of {num1} and {num2} is : ",num1/num2)
        else:
            print("Division by zero is not allowed.")
    elif(choice==5):
        print("Exiting the program.")
        break
    else:
        print("Invalid choice. Please try again.")

# Second Question
import random
secret_number = random.randint(1,10)
while True:
    guess = int(input("Guess the number (1-10):"))
    if guess == secret_number:
        print("Congratulations! You guessed the number correctly.")
        break
    else:
        print("Incorrect guess. Try again.")

# Third Question
task = []
while True:
    task = input("Type a tasks(or 'done' to finish)  : ")
    if task.lower() == 'done':
        break
    task.append(task)
    print("Your tasks are : ",task)

# fourth Question
numbers = list(range(1,21))
countEven = 0
countOdd = 0
for each in range(1,21,1):
    if each%2==0:
        countEven+=1
    else:
        countOdd+=1

print("Total even numbers are : ",countEven)
print("Total odd numbers are : ",countOdd)

#fifth Question
username = "Renu"
password = "renu123"
name = input("Enter your username : ")
passwrd = input("Enter your password : ")
if username == name and password == passwrd :
    print("login Successful")
else :
    print("Invalid credentials. Please try again.")

        
