import time
count = int(input("enter the counter num : "))
print("\n CountDown Start Now : ")
for i in range(count,0,-1):
    print(i)
    time.sleep(1)

print("\n WOHOO! Happy New Year")
