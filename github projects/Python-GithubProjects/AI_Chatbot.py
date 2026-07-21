# Rule based AI Pyhton Chatbot
import datetime
import time

name = input("Please enter your name: ")
presenthour=datetime.datetime.now().hour
if 5<= presenthour < 11:
    print("Good Morning, ",name)
elif 11<= presenthour < 16: 
    print("Good Afternoon,",name)
elif 16<= presenthour < 20:
    print("Good Evening!",name)
elif 20<= presenthour < 24:     
    print("Good Night!",name)
print("Namaste! Welcome to Your Buddy AI Chatbot!")
print("You can ask me basic Question, Type 'bye' to exit from the bot.")

#Chatbot Memory Creation [Dictionary of responses]
responses = {
    "hello": "Hi , welcome . How can I help you?",
    "how are you": "I am fine, thank you",
    "who are you":"I am smart AI Chatbot",
    "motivate me":"Keep Growing and Keep Learning . Every bug of your project makes you a better programmer.",
    "happy": "Great! I am happy to hear that.",
    "function kya hai": "Function is a block of code which only runs when it is called. You can pass data, known as parameters, into a function. A function can return data as a result.",
}
# Method/function to get response of chatbot
def getResponseOfBot(userQuestion):
    userQuestion = userQuestion.lower()
    for eachKey in responses :
        if eachKey in userQuestion:
            return responses[eachKey]

    return "Sorry, I don't understand that. I am still learing more. Please ask me something else."   
    
# Take user input
while True:
    userinput = input("please ask your question: ")
    reply = getResponseOfBot(userinput)
    print("Bot Response: ", reply)
    if "bye" in userinput.lower():
        print("Bot Response: Bye! Have a great day!")
        break