#include<stdio.h>
int main(){
    int n ,i ,j;
    int at[10],bt[10],wt[10],tat[10],ct[10];
    float avg_wt = 0,avg_tat = 0;
    int temp;
    printf("enter number of process :");
    scanf("%d",&n);
    for(i=0;i<n;i++){
    printf("enter AT and BT for p%d: ",i+10);
    scanf("%d%d",&at[i],&bt[i]);
    }
    for(i = 0 ; i < n-1;i++){
        for(j = i+1;j<n ;j++){
            if(at[i]>at[j]){
                temp = at[i];
                at[j] = at[j];
                at[j] = temp;

                temp = bt[i];
                bt[j] = bt[j];
                bt[j] = temp;
            }
        }
    }
    ct[0] = at[0]+bt[0];
    for(i = 1 ; i < n;i++){
        if(ct[i-1]<at[i])
        ct[i]=at[i]+bt[i];
    else ct[i] = ct[i-1] + bt[i];
    }
      for(i =0;i<n;i++){
        tat[i] = ct[i] - at[i];
        avg_tat +=tat[i]; 
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

