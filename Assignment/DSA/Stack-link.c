#include<stdio.h>
#define MAX_SIZE 5
int stack[MAX_SIZE];
int top=-1;
void push(int item){
    if(top == MAX_SIZE-1){
        printf("overflow and exit\n");
    }else{
        stack[++top]=item;
        printf("%d  Item inserted .\n", item);
    }
}
void pop(){
    if(top == -1){
        printf("underflow and exit\n");
    }else{
        int item=stack[top--];
        printf("%d  Item deleted .\n", item);
    }
}
void peek(){
    if(top== -1){
        printf("The stack is empty .\n");
    }else{
        printf("Top element = %d\n",stack[top]);
}
}
void Display(){
    int i ;
    if(top == -1){
        printf("The stack is empty .\n");
    }else{
        for( i =0;i<=top;i++){
            printf(" %d  ", stack[i]);
        }
        printf("\n");
    }
}
int  main(){
    int choice , item;
    printf(" 1. Push\n 2. Pop\n 3.Peek\n 4.Display\n 5.Exit\n");
    while(1){
        printf("enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
            printf("enter value to push : ");
            scanf("%d", &item);
            push(item);
            break;
            case 2:
            pop();
            break;
            case 3:
            peek();
            break;
            case 4:
            Display();
            break;
            case 5:
            return 0;
            default:
            printf("Invalid choice !!");
        }
    }
}