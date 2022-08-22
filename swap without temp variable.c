#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main (){
int a,b;
printf("enter first num : \n");
scanf("%d",&a);
printf("enter second num : \n");
scanf("%d",&b);
a = a+b;// creating a temp variable
b=a-b;
a=a-b;

printf("after swapping  : %d\n",a);
printf("after swapping  : %d\n",b);
}
