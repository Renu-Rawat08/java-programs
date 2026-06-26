#include<stdio.h>
int main(){
int arr[]={1,3,5,6,14,23,567,5634};
    int size=sizeof(arr)/sizeof(int);
    int element=7;
    int searchIndex=binarysearch(arr,size,element);
    printf("The element %d was found at index %d",element,searchIndex);
    return 0;
}
int binarysearch(int arr[],int size,int element){
    int low,mid,high;
    low=0;
    high=size-1;
    while(low<=high){
    mid=(low+high)/2;
    if(arr[mid]==element){
        return element;
    }
    if(arr[mid]<element){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
}
return -1;
}
int linearSearch(int arr[],int size,int element){
    for(int i=1;i<size;i++){
        if(arr[i]==element){
            return 1;
        }
    }
    return -1;
}