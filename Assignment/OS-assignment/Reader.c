#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
int main(){
    int fd;
    char*fifo = "myfifo";
    char buffer[100];
    fd = open(fifo ,O_RDONLY);
    read(fd ,buffer,sizeof(buffer));
    printf("Message recieved :%s\n",buffer);
    close(fd);
    return 0;
}