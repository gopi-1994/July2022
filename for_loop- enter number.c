#include<stdio.h>
int main(){
int num, count,sum = 0;
printf("Enter the number : ");
scanf("%d",&num);
for(count=1; count<=num; ++count){
    sum+= count;

}
printf("%d\n",sum);

}
