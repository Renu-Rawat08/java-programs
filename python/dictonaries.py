student = {
    "name" : "renu",
    "age" : 19,
    "city":"kashipur",
    "name":"siya",
}
print(type(student))
print(student["name"])
print(student["age"])
print(student) 
student["city"]="Hyderabad"
print(student)
student["favSubject"]="maths"
print(student)
student.pop("favSubject")
print(student)
print(student.keys())
print(student.items)
print(student.get("name"))
print(student.update({"country " : "india"}))