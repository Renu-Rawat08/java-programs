# first python program
def welcome_message():
    print("Welcome to Python Programming!")

welcome_message()
welcome_message()
welcome_message()
#Second Question
def inspire():
    print("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle. => by Renu")
inspire()

#Third Question
def good_morming():
    print("Good Morning,Renu!")
good_morming()

# Fourth Question
def display_python():
    print("Python is Fun!")
display_python()
#fifth Question
def learn():
    print("List")
    print("Tuple")
    print("Dictionary")
learn()
#sixth Question
def show_age(name , age):
    print(f"{name} is {age} years old")
show_age("Renu",19)
#seventh Question
def add_numbers(a,b):
    sum = a+b
    diff =a-b
    print(f"Sum = {sum} and Difference = {diff}")
add_numbers(5,10)
#eighth Question
def fav_food(food):
    print("Renu loves to eat",food)

fav_food("Pizza")

#Ninth Question
def square(num):
    return num**2
print("Square of 5 is:", square(5))

# Tenth Question
def fuct(userInput):
    vowels = "aeiouAEIOU"
    countVowels = 0
    countConsonants = 0
    for char in userInput:
        if char.isalpha():
            if char in vowels:
                countVowels += 1
            else:
                countConsonants += 1
    return countVowels, countConsonants

vowels, consonants = fuct("Hello, World!")
print(f"Number of vowels: {vowels}")
print(f"Number of consonants: {consonants}")

# Eleventh Question
def convert_to_uppercase(text):
    return text.upper()

print(convert_to_uppercase("hello, world!"))
#twelfth Question
def full_name(fname,lname):
    return fname + " " + lname
print(full_name("Renu","Rawat"))
#thirteenth Question
def message(text ="keep learning"):
    return text
print(message())
#fourteenth Question
def login(username,password="1234"):
    if password == "1234":
        return f"Welcome, {username}!"
    else:
        return "Invalid password."
login_result = login("Renu")
print(login_result)
# fifteenth Question
def match():
    score1 = 85
    score2 = 90
    if score1 > score2:
        return "Player 1 wins!"
    elif score2 > score1:
        return "Player 2 wins!"
    else:
        return "It's a tie!"
    
print(match())
#sixteenth Question