function addTask(){
    let task = document.getElementById("task").Value;
    let li = document.createElement("li");
    li.innerHTML = task;
    document.getElementById("list").appendChild(li);
    document.getElementById(task).Value = "";
}