let todolist=[
    {
    item:'Buy Milk',
    dueDate :'30/4/2026'
    },
    {
        item:'Go to College',
        dueDate:'30/4/2026'
    }
];
displayItems();

function addTodo(){
    let inputElement = document.querySelector('#todo-input');
    let dateElement = document.querySelector('#todo-date');
    let todoItem = inputElement.Value;
    let todoDate= dateElement.value;
    todolist.push({item:todoItem,dueDate:todoDate});
    inputElement.value = '';
    dateElement.value = '';
    displayItems();
}

function displayItems(){
    let containerElement = document.querySelector('.todo-container');
    let newHtml = '';
    for(let i = 0 ; i<todolist.length; i++){
        let {item,dueDate} = todolist[i];
        newHtml += `
        <span>${item}</span>
        <span>${dueDate}</span>


        <button class="btn-delete" onclick="todolist.splice(${i},1);
        displayItems();">Delete</button>
        `;
    }
    containerElement.innerHTML = newHtml;
}