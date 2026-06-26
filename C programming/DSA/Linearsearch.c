#include<stdio.h>
int main(){
    int arr[]={1,3,5,56,4,3,23,567,34};
    int size=sizeof(arr)/sizeof(int);
    int element=54;
    int searchIndex=linearSearch(arr,size,element);
    printf("The element %d was found at index %d",element,searchIndex);
    return 0;
}
int linearSearch(int arr[],int size,int element){
    for(int i=1;i<size;i++){
        if(arr[i]==element){
            return 1;
        }
    }
    return -1;
}