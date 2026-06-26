 const newelement = document.createElement("h2");
 newelement.textContent="strike is comming soon";
 newelement.id="second";

 console.log(newelement);
 const element = document.getElementById("first");
 element.after(newelement);
 const newelement2 = document.createElement("h3");
 newelement2.textContent= "april is commong soon";
 newelement2.id="third";
//  newelement2.className="diwali";
//  newelement2.className +=" holi";
//  newelement2.classList.add("diwali");
//  newelement2.classList.add("holi");
//  newelement2.classList.remove("diwali");
 newelement2.style.backgroundColor="pink";
 newelement2.style.fontSize="30px";
// newelement2.setAttribute("hello,ji");


//   element.before(newelement2);
//   console.log(newelement2.getAttribute("class"));

//  const list = document.createElement("li");
//  list.textContent="milk"
//  const list2 = document.createElement("li");
//  list.textContent="bead"
//  const unorderedelement = document.getElementById("listing");
//  unorderedelement.append(list);
// unorderedelement.append(list2);
const arr = ["milk","tea","coffee","bread","panner"];
const unorderedelement = document.getElementById("listing");
const fragment = document.createDocumentFragment();
for(let food of arr){
    const list = document.createElement("li");
    list.textContent=food;
   fragment.append(list);
}
 unorderedelement.append(fragment);
 const s1 = document.getElementById("first");
 s1.remove();
 