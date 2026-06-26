#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>
int main(){
    int fd;
    char*fifo = "myfifo";
    char msg[]="hello from writer";
    mkfifo(fifo , 0666);
    fd = open(fifo ,O_WRONGLY);
    write(fd ,msg,strlen(msg)+1);
    close(fd);
    return 0;
}