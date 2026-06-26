#include<stdio.h>
#include<string.h>
int main(){
	char s1[40],s2[30];
	printf("enter string 1:");
	gets(s1);
	printf("enter string 2:");
	gets(s2);
	if(strcmp(s1,s2)==0)
	printf("string are equal");
	else
	printf("string are unequal");
	return 0;
	}

