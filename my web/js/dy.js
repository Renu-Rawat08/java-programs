// function handleClick(){
//     const element = document.getElementById("first");
//     element.textContent="strike is comming";
// }
// const element = document.getElementById("first");
// // element.onclick = Function handleClick(){
// //  element.textContent="strike is comming";
// // }
// // element.onclick = Function handleClick(){
// // element.textContent="I am the best";
// // }
// element.addEventListener('mouseleave',()=>{
//     element.textContent="i am the best";
// })
// // element.addEventListener('click',()=>{
// //     element.style.backgroundColor="brown";
// // })

// let a={
//     greet:function(value){
//         console.log("hello",value);
//     }
// }
// a.greet(10);
// a.greet(20);
// const child1=document.getElementById("child1");
// child1.addEventListener('click',()=>{
//     child1.textContent="i am click";
// })
// const parent = document.getElementById("parent");
// console.log(parent.children);
// for(let child of parent.children){
//     child.addEventListener('click',()=>{
//         child.textContent="i am clicked";
//     })
// }
const grandparent= document.getElementById("grandparent");
    grandparent.addEventListener('click',()=>{
        console.log("grandparent is clicked");
    },true)
    const parent= document.getElementById("parent");
    parent.addEventListener('click',()=>{
        console.log("parent is clicked");
    },false)
    const child= document.getElementById("child");
    child.addEventListener('click',()=>{
        console.log("child is clicked");
    },true)