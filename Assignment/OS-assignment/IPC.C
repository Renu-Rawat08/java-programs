#include<stdio.h>
#include<unistd.h>
#include<string.h>
int main(){
    int fd[2];
    pid_t pid;
    char write_msg[]="hello from parent process";
    char read_msg[50];
    if(pipe(fd)==-1){
        printf("pipe failed\n");
        return 1;
    }
    pid=fork();
    if(pid<0){
        printf("fork failed\n");
        return 1;
    }
    if(pid>0){
        close(fd[0]);
        write(fd[1],write_msg,strlen(write_msg)+1);
        close(fd[1]);
    }else{
        close(fd[1]);
        read(fd[1],read_msg,sizeof(read_msg));
        printf("child recived : %s\n",read_msg);
        close(fd[0]);
    }
    return 0;
}