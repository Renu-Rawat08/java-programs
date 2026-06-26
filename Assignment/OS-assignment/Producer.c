#include<stdio.h>
int main(){
    int mutex= 1,full = 0,empty = 3 ,choice , item = 0;
    while(1){
        printf("\n 1. Produce\n2. Consumner\n3. Exit\n");
        printf("enter your choice :");
        scanf("%d",&choice);
        switch(choice){
            case 1 :
            if(mutex == 1 &&empty>0){
                mutex = 0;
                item++;
                printf("produced item %d\n",item);
                full++;
                empty--;
                mutex = 1;
            }else{
                printf("Buffer is full\n");
            }
            break;
            case 2:
            if(mutex == 1 &&full>0){
                mutex = 0;
                item++;
                printf("consumer item %d\n",item);
                item--;
                full++;
                empty--;
                mutex = 1;
            }else{
                printf("Buffer is empty\n");
            }
            break;
            case 3:
            return 0;
            deafult:
            printf("invalid choice \n");
        }
    }

}