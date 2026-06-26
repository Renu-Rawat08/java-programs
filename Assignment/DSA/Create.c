#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};

 struct Node *head=NULL;
 void create(int n){
    struct Node *temp,*newnode;
    int i;

    for(i=0;i<n;i++){
     newnode=(struct Node * )malloc(sizeof(struct Node));
     printf("enter data : ");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(head == NULL){
        head = temp = newnode;
    }else{
        temp->next = newnode;
        temp = newnode;
    }
}
}

void Display(){
    struct Node *temp=head;
    if(head == NULL){
        printf("List is empty!\n");
        return;
    }
    while(temp!=NULL){
        printf("%d -> ", temp->data);
        temp=temp->next;
    }
    printf("NULL\n");
}

void insertBeginning(){
    struct Node *newnode;
    newnode=(struct Node * )malloc(sizeof(struct Node));
     printf("enter data to insert at Beginnig: ");
    scanf("%d",&newnode->data);
    newnode->next=head;
    head=newnode;
    printf("Node inserted at Beginnig\n");
}

void insertAtPosition(){
    struct Node *newnode,*temp;
    int pos,i;
    newnode=(struct Node * )malloc(sizeof(struct Node));
    printf("enter position: ");
    scanf("%d %d",&pos);
    printf("enter data : ");
    scanf("%d",&newnode->data);
    
    temp = head;
    for(i=1;i<pos-1;i++){
        temp = temp->next;
    }
    newnode->next= temp->next;
    temp=temp->next;
    printf("Node inserted at position %d\n",pos);
}
void insertEnd(){
    struct Node *newnode,*temp;
    newnode=(struct Node * )malloc(sizeof(struct Node));
     printf("enter data to insert at end: ");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(head == NULL){
        head=newnode;
    }else{
        temp=head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=newnode;
    }
    printf("Node inserted at end\n");
}

void deleteBeginning(){
    struct Node *temp;
    if(head == NULL){
        printf("List is empty\n");
        return;
    }
    temp=head;
    head=head->next;
    printf("Deleted node = %d\n",temp->data);
    free(temp);
}

 void deleteAtPosition(){
     struct Node *temp,*ptr;
     int pos,i;
     printf("enter position to delete node :");
     scanf("%d",&pos);
     temp=head;
     for(i=1;i<pos-1;i++){
        temp = temp->next;
    }
    ptr= temp->next;
    temp->next = ptr->next;
    printf("Deleted node = %d\n",ptr->data);
    free(ptr);

}
    void deleteEnd(){
     struct Node *temp,*prev;
    if(head == NULL){
        printf("List id empty\n");
        return;
    }
        temp=head;
        while(temp->next!=NULL){
            prev = temp;
            temp=temp->next;
        }
        prev->next=NULL;
    printf("Delete node = %d\n",temp->data);
    free(temp);
}

void search(){
    struct Node *temp;
    int key , pos = 1,found =0;
    if(head == NULL){
        printf("List is empty");
        return;
    }
    printf("emter element to search :");
    scanf("%d",&key);
    temp=head;
    while(temp!=NULL){
        if(temp->data==key){
            printf("element found at position %d\n",pos);
            found=1;
            break;
        }
        temp=temp->next;
        pos++;
    }
    if(found==0){
        printf("element not found");
    }
}
void countNodes(){
    struct Node *temp;
    int Count = 0;
    temp = head;
    while(temp!=NULL){
        Count++;
        temp=temp->next;
    }
    printf("Total nodes = %d\n", Count);
}
int main(){
    int choice,n;
    printf("enter number of nodes = ");
    scanf("%d",&n);
    create(n);
    while(1){
        printf("\n--- Linked - list operation ---\n");
        printf("1. Display\n");
        printf("2. Insert at Beginnig\n");
        printf("3. Insert at Middle\n");
        printf("4. Insert at End\n");
        printf("5. Delete at Beginnig\n");
        printf("6. Delete at Middle\n");
        printf("7. Delete at End\n");
        printf("8. Search\n");
        printf("9. Count Nodes\n");
        printf("10. Exit\n");

        printf("enter your choice: ");
        scanf("%d",&choice);

        switch(choice){
            case 1:
            Display();
            break;

            case 2:
            insertBeginning();
            break;

            case 3:
            // insertMiddle();
            break;

            case 4:
            // insertEnd();
            break;

            case 5 :
            deleteBeginning();
            break;

            case 6:
            // deleteMiddle();
            break;

            case 7 :
            // deleteEnd();
            break;

            case 8:
            search();
            break;

            case 9:
            countNodes();
            break;
            case 10:
            exit(0);
            default:
            printf("Invalid choice");
        }
    }
    return 0;
}