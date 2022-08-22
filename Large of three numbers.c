#include<stdio.h>
int main()
{
double n1,n2,n3;
printf("Enter three number : ");
scanf("%lf%lf%lf",&n1,&n2,&n3);
if(n1>=n2 && n1>=n3)
printf("%.1lf is large number",n1);
else if(n2>n1 && n2>n3)
    printf("%.1lf is large number",n2);
    else
    printf("%.1lf is large number",n3);
    return 0 ;
}
