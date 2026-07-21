#def double(x):
 #   return x*2
def appl(fx,value):
    return 6+fx(value)
double = lambda x:x*2
cube = lambda x:x*x*x
avg = lambda x,y:(x+y)/2
print(double(5))
print(double(6))
print(cube(5))
print(avg(4,40))
print(appl(cube,2))
print(appl(cube,8))
print(appl(lambda x:x*x,2))