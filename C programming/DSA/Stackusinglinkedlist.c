#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
void linkedlisttransversal(struct Node*ptr){
    while(ptr!=NULL){
        printf("element %d\n",ptr->data);
        ptr=ptr->next;
    }
}
int isempty(struct Node* top ){
    if(top==NULL){
        return 1;
    }
    else{
        return 0;
    }
}
int isfull(struct Node* top){
    struct Node* p = (struct Node*)malloc(sizeof(struct Node));
    if(p==NULL){
        return 1;
    }
    else{
        return 0;
    }
}
int pop (struct Node** top ){
    if(isempty(*top)){
        printf("stack underflow\n");
    }
    else{
        struct Node* n=*top;
        *top = *top->next;
        int x = n->data;
        free(n);
        return x;
    }
}

int main(){
    struct Node *top=NULL;
    top = push(top,50);
    top = push(top,5);
    top = push(top,60);
    linkedlisttransversal(top);
    int element = pop(&top);
    printf("pop element is %d\n"element);
    linkedlisttransversal(top);
    return 0;
}