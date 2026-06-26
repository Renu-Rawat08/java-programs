#include<stdio.h>
int main(){
    int base, limit ,offset,physical_address;
    printf("enter base address :");
    scanf("%d",&base);
     printf("enter limit (segment size):");
    scanf("%d",&limit);
    printf("enter offset(logical address):");
    scanf("%d",&offset);
    if(offset<limit){
        physical_address =base+offset;
        printf("\nValid address\n");
        printf("physical address = %d\n",physical_address);
    }else{
        printf("\nValid address(segememtation faulty)\n");
    }
    return 0;
    }
