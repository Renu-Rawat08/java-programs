#include<stdio.h>
#include<string.h>
int main(){
	char s1[20],s2[20];
	printf("enter string:");
	gets(s1);
	strcpy(s2,s1);
	printf("copy string : %s\n",s2);
	return 0;
}
