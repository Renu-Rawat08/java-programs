#include<stdio.h>
int main(){
    int n ,m ,i ,j;
    int b[10],p[10],allocation[10];
    printf("enter number of blocks :");
    scanf("%d",&n);
     printf("enter number of process :");
    scanf("%d",&m);
     printf("enter  blocks size :\n");
    for(i=0;i<n;i++){
    scanf("%d",&b[i]);
    }
    printf("enter  process size :\n");
    for(i=0;i<m;i++){
    scanf("%d",&p[i]);
    allocation[i]=-1;
    }
    for(i = 0 ; i < m;i++){
       int bestidx = -1;
       for(j=0;j<n;j++){
        if(b[j]>=p[i]){
            if(bestidx==-1||b[j]<b[bestidx]){
                bestidx=j;
            }
        }
       }
       if(bestidx!=-1){
        allocation[i]=bestidx;
        b[bestidx]-=p[i];
       }
    }
      printf("\nProcess\tSize\tBlock No.\n");
      for(i=0;i<m;i++){
        if(allocation[i]!=-1){
      printf("\np%d\t%d\t%d\n"
    ,i+1,p[i],allocation[i]+1);
      }else
      printf("\np%d\t%d\t NOT Allocated\n"
    ,i+1,p[i]);
      }
      return 0;

}
