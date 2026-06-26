#include<stdio.h>
int linearsearch(int arr[],int size,int element){
	int i;
	for(i=0;i<size;i++){
		if(arr[i]==element){
		return 1;
	}
	return -1;
}
}
int main(){
	int arr[]={ 2,4,5,6,9,11,87};
	int size=sizeof(arr)/sizeof(int);
	int element=4;
	int searchIndex = linearsearch(arr,size,4);
	printf("the element %d found at index %d\n",elemnt,searchIndex);
	return 0;
}

