# print n numbers
def show(n):
    if(n==11):
        return
    print(n)
    show(n+1)
show(1)
show(5)


# first Question 
def factorial (n):
    if n==1 or n==0:
        return 1
    return n*factorial(n-1)
print("factorial of 5 is:", factorial(5))


# using recursion function calculate the sum of first n natural number
def sum(n):
    if n == 0 :
        return 0
    return sum(n-1)+n

print("the sum of n natural numbers " ,sum(5))

# using recursive function to print all elments in a list

def elememt(list, idx=0):
    if(idx ==len(list)):
        return
    print(list[idx])
    elememt(list,idx+1)
    
friuts =["apple","mango","banana","peach"]

elememt(friuts)
# second Question
def fibonacci(n):
    if n<=1:
        return n
    return fibonacci(n-1)+fibonacci(n-2)
print("fibonacci of 5 is:", fibonacci(5))



# third Question
#def num(n):
 #   return n
#for i in range(1,num) :
#   print("number from 1 to N is " , num(10))


def show1(m):
    if m==0 :
        return
    print(m)
    show1(m-1)
    print("END")

show1(3)