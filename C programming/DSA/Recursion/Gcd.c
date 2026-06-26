#include<stdio.h>
int gcd(int a ,int b){
    if(b==0){
        return a;
    }else{
        return gcd(b,a%b);
    }
}
int main(){
    int a , b ;
    printf("enter two positive number :");
    scanf("%d %d",&a,&b);
    printf("fibbonaci series of %d and %d is %d " , a , b , gcd(a,b));
}