#include<stdio.h>
int main(){
 int arr[100]={7,8,12,27,88};
int size=5,element=45,index=3;
display (arr,size);
indeletion (arr,size,element,index);
size -=1;
display(arr, size);
return 0;
}
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
        printf("\n");
}
int indeletion(int arr[],int size,int element,int index){
    for(int i=index;i>=size-1;i++){
        arr[i]=arr[i+1];
    }
    arr[index]=element;
    return 1;
}