#include<stdio.h>
int main(){
    int total_men,i ,n;
    int process[10];
    printf("enter total memory aviable :");
    scanf("%d",&total_men);
    printf("enter number of process :");
    scanf("%d",&n);

    for(i=0;i<n;i++){
        printf("enter menory required for process %d ",i+1);
        scanf("%d",&process[i]);
    }
    printf("\nProcess\tMemory required\tStatus\n");
      for(i=0;i<n;i++){
        if(process[i]<=total_men){
      printf("p%d\t%d\t%d\tAllocated\n"
    ,i+1,process[i]);
    total_men-=process[i];
      }else{
      printf("p%d\t%d\t\t NOT Allocated\n"
    ,i+1,process[i]);
      }
    }
    printf("\n Remaining Memory = %d\n",total_men);
      return 0;
}