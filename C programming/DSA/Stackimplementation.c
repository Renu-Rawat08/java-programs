#include<stdio.h>
#include<stdlib.h>
struct stack{
    int size;
    int top;
    int *arr;

};
 int isfull(struct stack *ptr){
    if(ptr->top== ptr->size-1){
        return 1;
    }
    else{
        return 0;
    }
 }
 int isempty(struct stack *ptr){
    if(ptr->top==-1){
        return 1;
    }
    else{
        return 0;
    }
 }

 void push(struct stack *ptr,int val ){
    if(isfull(ptr)){
        printf("stack is overflow\n cannot push %d to the stack\n",val);
    }
    else{
        ptr->top++;
        ptr->arr[ptr->top]=val;
    }
 }
int pop(struct stack *ptr ){
    if(isempty(ptr)){
        printf("stack is overflow cannot push  to the stack\n");
        return 0;
    }
    else{
      int val =  ptr->arr[ptr->top];
    }
 }
int main(){
    struct stack *sp=(struct stack *)malloc(sizeof(struct stack));
    sp->size = 10;
    sp->top=-1;
    sp->arr=(int*)malloc(sp->size* sizeof(int));
    printf("stack has been vreated");
     printf("begore pushing full:%d\n",isfull(sp));
      printf("begore pushing empty:%d\n",isempty(sp));
      push(sp,1);
      push(sp,43);
      push(sp,34);
      push(sp,23);
      push(sp,97);
      push(sp,56);
      push(sp,45);
      push(sp,46);
      push(sp,48);
      push(sp,4);
      printf("after pushing full:%d\n",isfull(sp));
      printf("after pushing empty:%d\n",isempty(sp));
      printf("popped %d from the stack\n",pop(sp));
      return 0;
}