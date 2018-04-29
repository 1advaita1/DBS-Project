//replace empty files with "unknown"
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
 FILE *fptr;
 char filename[10000];
 char  ch;
 scanf("%s",filename);
 //char sen[]="unknown";
 fptr=fopen(filename,"r+");
 if(fptr==NULL)
 {
  printf("error");
  exit(1);
 }
 if((ch=fgetc(fptr))==EOF)
 {
  fprintf(fptr,"unknown");
 }
 fclose(fptr);
 return 0;
}
