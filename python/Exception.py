print('this is my python class')

try :
    a = int(input("enter an integer : "))
    b= 7/a
    print(b)
except Exception as e:
    print("this is wrong input",e)
finally:
    print("this will be exceuted always")
 
c= int(input("enter a number :"))
l = [3,4,5,6,7,6]
for i in l :
    print(i)