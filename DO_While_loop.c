#include<stdio.h>
int main(){
int num, sum =0;
//do{
//    printf("%d\n",i);
//    ++i;
//}
//
//while(i<=5);
do{
    printf("Enter a number : ");
    scanf("%d",&num);
    sum+= num;
}
while(num!=0);
printf("%d",sum);
return 0;
}
