// const user ={
//     Name:"renu",
//     age:19,
//     emailId:"renu@gmail .com",
//     amount:4800,
//     "home address":"uk"
// }
// console.log(user["Name"]);
// console.log(user["home address"]);
// console.log(user);
// console.log(user.Name);
// user.addar=34342;
// user.amount=23443;
// delete user.age;
// console.log(user);
const user ={
    Name:"renu",
    age:19,
    emailId:"renu@gmail .com",
    amount:4800,
    // "home address":"uk",
    greeting: function(){
        console.log("strike is cpmming soon ${this.Name}");
        return 20;
    }
}
const va =user.greeting();
console.log(va);
user.greeting();
// const {Name,age}=user;
// console.log(Name,age);
// const {Name:userName,age:userAge}=user;
// console.log(userName,userAge);
// const arr=[10,30,39,29];
// const {first,second}=arr;
// console.log(first,second);
// console.log(Object.keys(user));
// console.log(Object.values(user));
// console.log(Object.entries(user));
// for(let values of Object.entries (user)){
//          console.log(values);
//  }