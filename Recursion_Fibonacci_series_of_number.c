#include<stdio.h>

int a=0,b=1,n;

int main(){
printf("Enter a number...");
scanf("%d" ,&n);

getfactorial(n-2);
printf("fibonacci series is....%d %d ",a,b);
printf("\n");
return 0;

}

// recursion program
void getfactorial(int n){
    int sum;
    if(n>0){
        sum=a+b;
        printf("%d ",sum);
        a=b;
        b=sum;
        getfactorial(n-1);
}
else

    return 0;

    }
