#include<stdio.h>
int main(){
int arr[100]={2,4,7,34,88};
int size=4,element=45,index=3;
display(arr,size);
indInsertion(arr,size,element,100,index);
size +=1;
display(arr, size);
return 0;
}
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
        printf("\n");
}
int indInsertion(int arr[],int size,int element,int capacity,int index){
    if(size>=capacity){
        return -1;

    }
    for(int i=size;i>=index;i--){
        arr[i+1]=arr[i];
    }
    arr[index]=element;
    return 1;
}

