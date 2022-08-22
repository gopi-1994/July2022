#include<stdio.h>

int num, fact;


int main(){
printf("Enter a number...");
scanf("%d",&num);
fact=factorial(num);
printf("factorial of %d is ...%d\n",num,fact);
return 0;

}

// recursion program
int factorial(int n){
    if(n==0){
    return 0;
    }
    else if(n==1){
    return 1;
    }
    else
    {
      return(n*factorial(n-1));
    }
    }
