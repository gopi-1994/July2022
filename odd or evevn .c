#include<stdio.h>
int main(){
int num, num1;
printf("Enter a num : ");
scanf("%d",&num);
if(num%2==0)
{
     printf("it is an even number\n");
}

else{
     printf("it is an odd number\n");
     }
//     using ternary opertaor
printf("Enter a num1 : ");
scanf("%d",&num1);
(num1%2==0)?printf("it is an even number\n"):printf("it is an odd number\n");

}
