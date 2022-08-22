#include<stdio.h>
int main(){
int i,num,sum=0;
for(i=1;i<=5;i++){
    printf("Enter num%d...",i);
    scanf("%d",&num);
    if(num<0){
        continue;
    }
sum +=num;
}
printf("sum of number....%d",sum);

}
