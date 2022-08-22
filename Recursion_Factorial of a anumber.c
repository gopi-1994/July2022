#include<stdio.h>

int fact(int n ){
    if(n==0){
    return 0;// calling the own function-- recursion
    }
    else if(n==1){
        return 1;
        }
        else{
            return n*fact(n-1);
}
        }

int main(){
int n1,result;
printf("Enter a number...");
scanf("%d",&n1);
result = fact(n1);
printf("Factorial of %d is...%d",n1,result);
}
