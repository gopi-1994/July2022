#include<stdio.h>
int main(){
int n1,result;
printf("Enter a number...");
scanf("%d",&n1);
result = sum(n1);
printf("sum of natural number ...%d",result);
}
int sum(int n){
    if(n!=0)
    return n+sum(n-1);// calling the own function-- recursion
    else
        return 0;}
