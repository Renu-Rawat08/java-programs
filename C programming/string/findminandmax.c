#include<stdio.h>
int main(){
	int arr[5];
	int i,min,max;
	printf("enter 5 elements:");
	for(i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	min=max =arr[0];
	for(i=0;i<7;i++){
	   if(arr[i]<min)
	   min = arr[i];
	   if(arr[i]>max)
	   max=arr[i];
	}
	printf(" largest element:%d\n",max);
	printf(" smllest element:%d\n",min);
}
