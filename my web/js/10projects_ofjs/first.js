const quotes = [
   " Believe in yourself and all that you are.",
"Stay afraid, but do it anyway.",
"If there is no struggle, there is no progress.", 
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life."
];
const button  = document.querySelector('button');
const quote = document.querySelector('h1');
button.addEventListener('click',()=>{
    const index = Math.floor(Math.random()*quotes.length);
    quote.textContent = quotes[index];
})