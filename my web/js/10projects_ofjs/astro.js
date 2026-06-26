const zodiacSigns=[
    "capricon","aquaris","pisces","Aries","Tarus","Gemini",
    "Cancer","Leo","Vigro","Scropio","sagittarius"
];


// 31
const compliment=[
 " Believe in yourself and all that you are.",
"Stay afraid, but do it anyway.",
"If there is no struggle, there is no progress.", 
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up."
];

// 20
const victimcardcompliment=[
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.",
"Life is what happens to you while you're busy making other plans."

];
// 30
const recommandation=[
    "Stay afraid, but do it anyway.",
"If there is no struggle, there is no progress.", 
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up."

];
// 20
const predication=[
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Never, never, never give up.",
"You miss 100% of the shots you don't take.",  
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.", 
"Growth must be chosen again and again; fear must be overcome again and again.", 
"Don't let a bad day make you think that you have a bad life.",
"Life is what happens to you while you're busy making other plans.",
"To live is the rarest thing in the world. Most people exist, that is all.",
"Life is what happens to you while you're busy making other plans."
];



const form = document.getElementById('astroform');
form.addEventListener('submit',(e)=>{
    e.preventDefault();
    const name = document.getElementById('name').Value;
    const surname = document.getElementById('surname').Value;
    const day = parseIntdocument.getElementById('day').Value;
    const month = parenIntdocument.getElementById('month').Value;
    const year = parseIntdocument.getElementById('year').Value;


    const text = `Hi ${name} ${surname},your Zodic sign is ${zodiacSigns[month-1]}
    .${compliment[day-1]}. ${victimcardcompliment[year%20]}.${recommandation[(day*month)%30]}
    .${predication[(name.length*surname.length)%20]}`;
    document.getElementById('result').textContent = text;
})