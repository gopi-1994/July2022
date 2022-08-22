#include<stdio.h>
int main(){

int n1,n2,choice;
void exit();
do{
printf("Select one operation:-\n 1 Addition\t 2 Subtraction\n 3 Multiply\t 4 Division\n 5 Exit\n");
scanf("%d",&choice);
}
while(choice>=6||choice<=0);
if(choice==5)
{
    printf("\nThanks for Choosing Calculator");
    exit(0);
    }
if(choice>=1||choice<=4)
{printf("Enter first number...");
scanf("%d",&n1);
printf("Enter second number...");
scanf("%d",&n2);
}

int add(){
int c = n1+n2;
printf("%d + %d = %d",n1,n2,c);
}
int sub(){
int c = n1-n2;
printf("%d - %d = %d",n1,n2,c);
}
int mul(){
int c = n1*n2;
printf("%d * %d = %d",n1,n2,c);
}
int div(){
double c = (double)n1/(double)n2;
printf("%d / %d = %lf",n1,n2,c);
}
switch(choice){

case 1:
    add();
     printf("\nThanks for Choosing Calculator");
break;
case 2:
    sub();
     printf("\nThanks for Choosing Calculator");
break;
case 3:
    mul();
     printf("\nThanks for Choosing Calculator");
break;
case 4:
    div();
    printf("\nThanks for Choosing Calculator");
break;
default:
    printf("\nSelect Proper operator");
    break;
}

}
