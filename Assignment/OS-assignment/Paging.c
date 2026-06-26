#include<stdio.h>
int main(){
    int page_size ,page_number,offset, logical_address;
    printf("enter page size :");
    scanf("%d",&page_size);
    printf("enter logical Address :");
    scanf("%d",&logical_address);
    page_number =logical_address / page_size;
    offset = logical_address % page_size;
    printf("\nPage Number = %d\n",page_number);
    printf("offset = %d\n",offset);
    return 0;
}