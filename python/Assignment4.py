fruits= ("apple","mango","banana","grapes","orange")
print("Total Friuts : ",len(fruits))
print("Index of Banana : ",fruits.index("banana"))
marks = int(input("Enter the marks : "))
if(marks>=90) :
    print("Grade A ")
elif(marks<=90 and marks>=80) :
    print("Grade B")
elif(marks<=80 and marks>=65) :
    print("Grade C ")
else :
    print("Grade D")