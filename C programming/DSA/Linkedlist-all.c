#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int value;
    struct Node *next;
}*m,*f,*t;


void Create()
{
    m=(struct Node*)malloc(sizeof(struct Node));
    printf("\n enter a number = ");
    scanf("%d",&m->value);
    m->next=NULL;

    f=m;
    t=m;
}


void Display()
{
    struct Node *Dis;
    printf("\n List items : ");
    printf(".... ... ...  ... ...");

    Dis = f ;
    while(Dis != NULL)
    {
        printf("%d",Dis->value);
        Dis = Dis->next;
    }
}


void AddLast()
{
    m=(struct Node*)malloc(sizeof(struct Node));
    printf("\n enter a number = ");
    scanf("%d",&m->value);
    t->next=NULL;
    t->next=m;
    t=m;
}


void AddFirst(){
    m=(struct Node*)malloc(sizeof(struct Node));
    printf("\n enter a number = ");
    scanf("%d",&m->value);
    m->next=f;
    f=m;
}


void DeleteFirst()
{
    struct Node *r;
    r = f;
    printf("\n Delete item = %d",r->value);
    f=f->next;
    free(f);
}


void DeleteLast()
{
    struct Node *v1,*v2;
    v1= f;
    while(v1->next!=NULL)
    {
        v2 = v1;
        v1 = v1->next;
    }
    printf("\n Delete  last item = %d",v1->value);
    v2->next=NULL;
    free(v1);
    t = v2;
}


void main()
{
    int choice = 0;
    char status = 'n';
    do
    {
        printf("\n 1 for Create List");
        printf("\n 2 for Add Last");
        printf("\n 3 for Add First");
        printf("\n 4 for Add Anywhere");
        printf("\n 5 for Search");
        printf("\n 6 for Delete First");
        printf("\n 7 for Delete Last");
        printf("\n 8 for Delete Anywhere");
        printf("\n 9 for Display");
        printf("\n 0 for Exit");

    printf("\n enter choice = ");
    scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            {
                Create();
                break;
            }
            case 2:
            {
                AddLast();
                break;
            }
            case 3:
            {
                AddFirst();
                break;
            }
            case 4:
            {
                break;
            }
            case 5:
            {
                break;
            }
            case 6:
            {
                DeleteFirst();
                break;
            }
            case 7:
            {
                DeleteLast();
                break;
            }
            case 9:
            {
                Display();
                break;
            }
            default:
            {
                printf("wrong choice : try again...");
                break;
            }
        }

    printf("\nyou want to continue ....(y/n) = ");
    scanf("%c", &status);
    }while(status =='y');
    
}