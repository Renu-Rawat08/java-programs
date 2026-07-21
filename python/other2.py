# first
print("python \n is \n fun")
# Second
num = [1,2,3,4,5,6,7,8,9,10]
for n in num:
    if n%2==0 :
        print(n)
# Third
student = {
    "name" : "renu",
    "course": "BCA",
    "year":2026
}
for key, value in student.items():
    print(f"{key}:{value}")
# Fourth

num1 = int(input("Enter a number : "))
if(num1%3==0 and num1%5==0):
    print("the number is divisible by both 5 and 3 is ",num1)
else :
    print("the number is not divisible by both 5 and 3 is ",num1)
#fifth
print("sqaure of the number 5 is ",5**2)
print("cube of the number 5 is ",5**3)

#sixth 
num2 = int(input("Enter a number : "))
if(num2%2==0):
    print(num2 ,"is even number .")
else :
    print(num2 ,"is odd number")

#seventh
i=1
num3=7
for each in range(1,11,1):
    print(num3,"*",each,"=", each*num3)
    i+=1

#eight 
while True:
    text=input("enter write something user not enter exit !" )
    if text=="exit":
        break
    else:
        print("you typed : ",text)
#ninth 
for eachterm in range(1,21,1) :
    if(eachterm%4==0):
        print(eachterm)

#tenth
age = int(input("enter user age : "))
if age<18 :
    print("Minor")
elif age>18 and age<60 :
    print("adult")
else:
    print("Senior citizen")