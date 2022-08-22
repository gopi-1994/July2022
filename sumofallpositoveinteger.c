#include<stdio.h>
int main(){
int i,n,sum=0;
do{
    printf("Enter a positive Integer....");
    scanf("%d",&n);
}while(n<=0);
for(i=1;i<=n;i++)
{
sum+=i;

}
    printf("Sum of all positive integera...%d",sum);
return 0;

}
