#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
int main(){
    struct Node *head=NULL,*temp,*newnode;
    int n , i;
    printf("enter number of nodes :");
    scanf("%d",&n);
    for(i=0;i<n;i++){
     newnode=(struct Node * )malloc(sizeof(struct Node));
     printf("enter data for nodes %d :", i+1);
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(head == NULL){
        head = temp =newnode;
    }else{
        temp->next=newnode;
        temp=newnode;
    }
}
printf("linked list :");
temp=head;
while(temp != NULL){
    printf("%d ->", temp->data);
    temp = temp->next;
}
printf("NULL");
    return 0;
}