#include<stdio.h>
int main(){
//   using while loop
int i, n, sum=0;
printf("Enter a number....");
scanf("%d",&n);
i=1;
while(i<=n)
{sum+=i;
i++;
}
printf("Sum of natural number...%d",sum);
return 0;
}
