// function greeting(){
//     console.log("hello");
//     return 10;
// }
// function Addnumber(num1,num2,num3=0.,num4=0){
//     const sum=num1+num2+num3+num4;
//     console.log(sum);
// }
// function Addnumber(...num){
//     let sum=0;
//     for(let n of num){
//         sum+=n;
//     }
//     console.log(sum);
// }
// Addnumber(3,4);
// Addnumber(4,6,7);
// Addnumber(6,7,3,4);
// Addnumber(3,5,3,4,2,3,4,2,3,2,);
// const addnum=function(num1,num2){
//     return num1+num2;
// }
// console.log(addnum(3,4));
// const num =(num1,num2)=>{
//     return num1+num2;
// }
// console.log(num(3,4));
// const num =(num1,num2)=> num1+num2;
// console.log(num(3,4));
// const square =num1=> num1*num1;
// console.log(square(5));
// // const greet=()=>{
// //     let user={
// //         Name:"renu",
// //         age:39
// //     }
// //     return user;
// // }
// // console.log(greet());
// const greet=()=>({   Name:"renu",  age:39});
// console.log(greet());
// (function Hello(){
//     console.log("hello");
// })()


function greet(){
    console.log("hello");
}
function meet(callback){
    console.log("i am going me meet someine");
    callback();
    console.log("i have finished meeting");
}
meet(greet);
