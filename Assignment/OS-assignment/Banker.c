#include<stdio.h>
int main(){
    int n ,i ,j,m,k;
    int alloc[10][10],max[10][10],need[10][10]
    ,avail[10],finish[10]={0},sefeSeq[10];
    
    printf("enter number of process :");
    scanf("%d",&n);
     printf("enter number of resource :");
    scanf("%d",&m);
    printf("enter allocation matrix :\n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
    scanf("%d",&alloc[i][j]);
    printf("enter Maximum matrix : \n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
           scanf("%d",&max[i][j]);
           
           printf("enter avialoable rezource :\n");
           for(i=0;i<m;i++)
           scanf("%d",&avail[i]);

           for(i=0;i<n;i++)
        for(j=0;j<m;j++)
           need[i][j]=max[i][j] - alloc[i][j];
           int count = 0;
           while(count<n){
            int found = 0 ;
            for(i=0;i<n;i++){
                if(finish[j]==0){
                    int ok = 1;
                    for(j=0;j<m;j++){
                        if(need[i][j]>avail[j]){
                            ok=0;
                            break;
                        }
                    }
                    if(ok){
                        for(k=0;k<m;k++)
                        avail[k] += alloc[i][k];
                    sefeSeq[count++]=i;finish[i]=1;
                    found =1;
                    }
                }
            }
            if(found == 0){
                printf("\n System is not in safe state (deadlock possible)\n");
                return 0;
            }
           }
           printf("\n System is in safe state\n");
           for( i =0 ;i<n ; i++){
           printf("p%d",sefeSeq[i]);
           return 0;
           }
    }
