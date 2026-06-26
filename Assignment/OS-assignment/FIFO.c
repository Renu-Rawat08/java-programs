#include<stdio.h>
int main(){
    int n ,i ,j,f,k=0,flag,faults=0;
    int pages[50],frames[50];
    
    printf("enter number of pages :");
    scanf("%d",&n);
     printf("enter page reference string :\n");
     for(i=0;i<n;i++){
         scanf("%d",&pages[i]);
     }
    printf("enter number frames:");
     scanf("%d",&f);

    for(i=0;i<n;i++)
    frames[i]=-1;
           
           printf("frames status:\n");
           for(i=0;i<n;i++){
            flag=0;

           for(i=0;j<f;j++){
            if(frames[j]==pages[i]){
                flag = 1;
                break;
            }
        }
          if(flag==0){
            frames[k]=pages[i];
            k=(k+1)%f;
            faults++;
          }
            for(j=0;j<f;j++){
            if(frames[j]!=-1)
                printf("%d",frames[j]);
            else printf("-");
          }
          printf("\n");
                    }
           printf("\n Total page faults =%d\n",faults);
           return 0;
           }
