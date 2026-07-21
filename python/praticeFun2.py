# function with parameters
def average(a,b):
    average =(a+b)/2
    print(average)
average(5,10)
average(7,10)
average(3,89)
average(2,4)
# function with return type
def get_average(a,b):
    average = (a+b)/2
    return average
print(get_average(5,10))
print(get_average(7,10))

# function with default parameters
def get_average(a=5,b=10):
    average = (a+b)/2
    return average  
print(get_average())

def show(name ,age):
    print(f"My name is {name} and i am {age} years old")

show("renu",19)
show("riya",59)

def shows(name="divya",age=19):
    print(f"My name is {name} and i am {age} years old")
shows()

def add(a,b):
    return a+b
result = add(5,10)
print("result = ",result)

def square(num):
    return num**2
print(square(5))
