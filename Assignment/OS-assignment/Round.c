#include<stdio.h>
int main(){
    int n ,i,remain,time=0;
    int at[10],bt[10],wt[10],tat[10],ct[10],rt[10];
    float avg_wt = 0,avg_tat = 0;
    int tq;
    printf("enter number of process :");
    scanf("%d",&n);
    for(i=0;i<n;i++){
    printf("enter AT and BT for p%d: ",i+10);
    scanf("%d%d",&at[i],&bt[i]);
    rt[i]=bt[i];
    }
    printf("enter time quntam :");
    scanf("%d",&tq);
    remain = n;
    while(remain > 0){
        int executed = 0;
        for(i=0;i<n;i++){
            if(at[i]<= time && rt[i > 0]){
                executed = 1;
                if(rt[i]>tq){
                    time++;
                    rt[i]-=tq;
                }else{
                    time+=rt[i];
                    ct[i]=time;
                    rt[i]=0;
                    remain--;
                }
            }
        }
        if(executed == 0){
            time++;
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