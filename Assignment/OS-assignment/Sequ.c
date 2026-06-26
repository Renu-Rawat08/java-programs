#include<stdio.h>
int main(){
    int start,length,i;
    printf("enter starting block : ");
    scanf("%d",&start);
    printf("Enter length of file(number of blocks): ");
    scanf("%d",&length);
    printf("\nAllocated Blocks :\n");
    for(i=0;i<length;i++){
        printf("%d", start+i);
    }
    printf("\n");
    return 0;
}