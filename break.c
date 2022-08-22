#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){

int i,num,sum=0;
for(i=1;i<=5;i++){;

    printf("Enter num%d...",i);
    scanf("%d",&num);
    if(num<0){
        break;
    }
    sum += num;
}
printf("Sum of number you entered is...%d",sum);
    return 0;


}
