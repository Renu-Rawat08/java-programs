#include<stdio.h>
#define MAX 5
int stack[MAX];
int top=-1;
int isFull(){
    if(top == MAX-1)
    return 1;
else 
return 0;
}
int  isEmpty(){
    if(top == -1)
    return 1;
    else 
    return 0;
}
void push(int item){
    if(isFull()){
        printf("overflow and exit\n");
    }else{
        top++;
        stack[top]=item;
        printf("%d  Item pushed .\n", item);
    }
}
void pop(){
    if(isEmpty){
        printf("underflow and exit\n");
    }else{
        printf("%d  Item deleted .\n", stack[top]);
        top--;
    }
}
void peek(){
    if(isEmpty()){
        printf("The stack is empty .\n");
    }else{
        printf("Top element = %d\n",stack[top]);
}
}
void Display(){
    int i ;
    if(isEmpty()){
        printf("The stack is empty .\n");
    }else{
        printf("stack elements are :\n");
        for( i = top;i>=0;i--){
            printf(" %d  ", stack[i]);
        }
        printf("\n");
    }
}
int  main(){
   push(10);
   push(20);
   push(30);
   Display();
   peek();
   pop();
   Display();
   return 0;
}