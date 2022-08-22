#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main (){
int a,b,t;
printf("enter first num : \n");
scanf("%d",&a);
printf("enter second num : \n");
scanf("%d",&b);
t = a;// creating a temp variable
a=b;
b=t;

printf("after swapping  : %d\n",a);
printf("after swapping  : %d\n",b);
}
