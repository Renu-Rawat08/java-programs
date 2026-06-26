#include<stdio.h>
int main(){
    int n ,i,completed=0,time=0;
    int at[10],bt[10],wt[10],tat[10],ct[10];
    float avg_wt = 0,avg_tat = 0;
    int visited[10]={0};
    printf("enter number of process :");
    scanf("%d",&n);
    for(i=0;i<n;i++){
    printf("enter AT and BT for p%d: ",i+10);
    scanf("%d%d",&at[i],&bt[i]);
    }
    while(completed < n){
        int idx = -1;
        int min= 9999;
    for(i = 0 ; i < n;i++){
            if(at[i] <= time && visited[i] == 0){
                if(bt[i] < min){
                min = bt[i];
                idx = i;
                }
            }
        }

            if(idx==-1){
                time++;
            }else{
                time+=bt[idx];
                ct[idx]=time;
                visited[idx]=1;
                completed++;
            }
        }
      for(i =0; i<n; i++){
        tat[i] = ct[i] - at[i];
        avg_tat += tat[i]; 
        wt[i] = tat[i] - bt[i];
        avg_wt += wt[i]; 
      }
      avg_tat/=n;
      avg_wt/=n;

      printf("\nP\tAT\tBT\tCT\tWT\tTAT\n");
      for(i=0;i<n;i++){
      printf("\np%d\t%d\t%d\t%d\t%d\t%d\n"
    ,i+1,at[i],bt[i],ct[i],wt[i],tat[i]);
      }
      printf("\nAverage wating time = %.2f",avg_wt);
       printf("\nAverage turn around  time = %.2f",avg_tat);
      return 0;
}

