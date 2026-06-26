#include<stdio.h>
int main(){
    int i;
    for(i=0;i<5;i++){
        printf("Philospher %d is Thinking\n",i+1);
        printf("Philospher %d picks up left chopisticks\n",i+1);
        printf("Philospher %d picks up right chopisticks\n",i+1);
        printf("Philospher %d is Eating\n",i+1);
        printf("Philospher %d puts down chopsticks\n\n",i+1);
    }
    return 0;
}