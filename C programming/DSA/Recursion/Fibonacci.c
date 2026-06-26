#include<stdio.h>
int fibbo(int n){
    if(n==0){
        return 0;
    }
    if(n==1||n==2){
        return 1;
    }else{
        return (fibbo(n-1)+fibbo(n-2));
    }
}
int main(){
    int n ;
    printf("enter a number :");
    scanf("%d",&n);
    printf("fibbonaci series of %d is %d " , n , fibbo(n));
}