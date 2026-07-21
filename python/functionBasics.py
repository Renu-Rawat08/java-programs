#function basics
#def sumFun() :
 #   a = 3
#  b = 5
 #   sum = a+b
   # print(sum)
#a = 3
# = 4
#sum = a + b
#print(sum)
#average = (a + b) / 2
#print(average)
#sumFun()
#sumFun()

# first Question
cities = ["delhi","goa","pune","mumbai","channai"]
heroes =["thor","ironman","captain america"]

print(heroes[0] ,end=" ")
print(heroes[2])
def print_len(list):
    for item in list:
        print(item,end=" ")

print_len(cities)
print_len(heroes)

# Factorial Methods
# first method

def fact(n):
    if n==1:
        return 1
    return n*fact(n-1)

print("factorial of 5 is",fact(5))

# second method
m=5
fact1=1
for i in range(1,m+1):
    fact1*=i
print("the factoral of 5 is ",fact1)

#another method
def cal_fact(k):
    fact2 = 1
    for p in range(1,k+1):
        fact2*=p
    print(fact2)

cal_fact(9)

# third Question
def converter(usd_val):
    inr_val = usd_val * 83
    print(usd_val,"USD =",inr_val,"INR")

converter(100)

# homeWork Qestion
num = int(input("Enter a number :"))
def check(num):
    if num%2==0:
        print("EVEN")
    else:
        print("ODD")

check(num)