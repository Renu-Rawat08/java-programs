const div = document.querySelector('div');
setInterval(()=>{

let time  = new Date ();
div.textContent = time.toLocaleTimeString();
},1000);
const day = document.querySelector('div');
setInterval(()=>{
    let day = new Date();
    div.textContent = day.toDateString();
})

//  2aconsole.log(time.toLocaleTimeString);