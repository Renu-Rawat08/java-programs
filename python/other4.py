print("==== Main Menu ====")
while True :
    print("1. Calculator")
    print("2. Number Guessing Game")
    print("3. To-do List")
    print("4. Even and Odd Counter")
    print("5. Exit")
    mainChoice = int(input("Enter your choice :"))
    if mainChoice == 1:
        # Call the calculator function or code here
        num1 = int(input("Enter first number : "))
        num2 = int(input("Enter second number : "))
        while True :
            print("1. Addition")
            print("2. Subtraction") 
            print("3. Multiplication")
            print("4. Division")
            print("5. Exit")
            choice = int(input("Enter your choice : "))
            if choice == 1:
                print(f"Addition of {num1} and {num2} is : ", num1 + num2)
            elif choice == 2:
                print(f"Subtraction of {num1} and {num2} is : ", num1 - num2)
            elif choice == 3:
                print(f"Multiplication of {num1} and {num2} is : ", num1 * num2)
            elif choice == 4:
                if num2 != 0:
                    print(f"Division of {num1} and {num2} is : ", num1 / num2)
                else:
                    print("Division by zero is not allowed.")
            elif choice == 5:
                print("Exiting the calculator.")
                break
            else:
                print("Invalid choice. Please try again.")
    elif mainChoice == 2:
        # Call the number guessing game function or code here
        import random
        secret_number = random.randint(1, 10)
        while True:
            guess = int(input("Guess the number (1-10): "))
            if guess == secret_number:
                print("Congratulations! You guessed the number correctly.")
                break
            else:
                print("Incorrect guess. Try again.")
    elif mainChoice == 3:
        # Call the to-do list function or code here
        tasks = []
        while True:
            task = input("Type a task (or 'done' to finish): ")
            if task.lower() == 'done':
                break
            tasks.append(task)
        print("Your tasks are : ", tasks)
    elif  mainChoice == 4:
        # Call the even and odd counter function or code here
        countEven = 0
        countOdd = 0
        for i in range(1, 21):
            if i % 2 == 0:
                countEven += 1
            else:
                countOdd += 1
        print("Total even numbers are : ", countEven)
        print("Total odd numbers are : ", countOdd)
    elif  mainChoice == 5:
        print("Exiting the program.")
        break
    else:
        print("Invalid choice. Please try again.")